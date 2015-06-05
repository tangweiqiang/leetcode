package javasolution;

import java.util.Map;

/**
 * Created by 汤伟强 on 2015/6/5.
 */
public class Solution050 {
    public double myPow(double x, int n) {
        if (n==0)
            return 1;
        else if (n<0) {
            if (n==Integer.MIN_VALUE)
                return 1 / (x*myPow(x,Integer.MAX_VALUE));
            return 1 / myPow(x, -n);
        }else{
            double d = myPow(x,n/2);
            if (n%2 == 0)
                return d*d;
            else
                return d*d*x;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution050().myPow(-1.00000, -2147483648));
    }
}
