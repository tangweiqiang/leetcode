package javasolution;

/**
 * Created by 汤伟强 on 2015/6/11.
 */
public class Solution070 {
    public int climbStairs(int n) {
        //超时
        /*if (n > 2)
            return climbStairs(n-1)+climbStairs(n-2);
        else if (n == 1)
            return 1;
        else if (n == 2)
            return 2;
        else return 0;*/
        if(n == 0 || n == 1) return 1;
        int pre = 1;
        int cur = 1;
        for (int i = 2; i < n; i++) {
            int tmp = cur + pre;
            pre = cur;
            cur = tmp;
        }
        return cur;
    }

    public static void main(String[] args) {
        System.out.println(new Solution070().climbStairs(10));
    }
}
