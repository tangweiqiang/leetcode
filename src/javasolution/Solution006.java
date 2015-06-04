package javasolution;

/**
 * Created by 汤伟强 on 2015/6/4.
 */
public class Solution006 {
    public String convert(String s, int numRows) {
        if (numRows <= 1 || s.length()<=numRows)
            return s;
        String result="";
        int step = 2 * numRows - 2;

        int n = (s.length()%step==0)?s.length()/step:s.length()/step + 1;
        for (int i=0;i<s.length();i+=step)
            result += s.charAt(i) ;
        for (int i=1;i<numRows-1;i++){
            for (int j=0;j<n-1;j++){
                result = result + s.charAt(step*j+i) + s.charAt((j+1)*step-i);
            }
            if (step*(n-1)+i < s.length())
                result += s.charAt(step*(n-1)+i);
            if (n*step-i < s.length())
                result += s.charAt(n*step-i);
        }
        for (int i=numRows-1;i<s.length();i+=step)
            result += s.charAt(i);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution006().convert("ABCDE",4));
    }
}
