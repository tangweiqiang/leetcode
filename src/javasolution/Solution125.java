package javasolution;

/**
 * Created by 汤伟强 on 2015/6/11.
 */
public class Solution125 {
    public boolean isPalindrome(String s) {
        if (s.equals("")) return true;
        s=s.toLowerCase();
        int left = 0;
        int right = s.length()-1;
        while (left < right){
            while (unValid(s.charAt(left))) {
                left++;
                if (left>right) return true;
            }
            while (unValid(s.charAt(right))) {
                right--;
                if (left>right) return true;
            }
            while (s.charAt(left)!=s.charAt(right) ){
                return false;
            }
            left++;right--;
        }
        return true;

    }
    public boolean unValid(char c){
        if (c >= 'a' && c <= 'z') return false;
        if (c >= '0' && c <= '9') return false;
        return true;
    }

}
