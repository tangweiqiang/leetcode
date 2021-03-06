package javasolution;

/**
 * Created by 汤伟强 on 2015/6/4.
 */
public class Solution012 {
    int[] val = {
            1000, 900, 500, 400,
            100, 90, 50, 40,
            10, 9, 5, 4,
            1
    };
    String[] syb = new String[] {
            "M", "CM", "D", "CD",
            "C", "XC", "L", "XL",
            "X", "IX", "V", "IV",
            "I"
    };
    public String intToRoman(int num) {
        StringBuilder roman = new StringBuilder();
        int i=0 ,k;
        while (num>0){
            k = num /val[i];
            while (k-- >0) {
                roman.append(syb[i]);
                num -= val[i];
            }
            i++;
        }
        return roman.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Solution012().intToRoman(3000));
    }
}
