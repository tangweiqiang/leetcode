package javasolution;

/**
 * Created by 汤伟强 on 2015/6/11.
 */
public class Solution098 {
    public boolean isValidBST(TreeNode root) {
        return dfs(root,(long)Integer.MIN_VALUE,(long)Integer.MAX_VALUE);
    }

    private boolean dfs(TreeNode root,long min,long max){
        if (root == null) return  true;
        return root.val>min && root.val<max &&
                dfs(root.left,min,root.val) && dfs(root.right,root.val,max);
    }
}
