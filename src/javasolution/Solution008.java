package javasolution;

/**
 * Created by 汤伟强 on 2015/6/4.
 */
public class Solution008 {
    public int myAtoi(String str) {
        int ret=0;
        int i = 0;
        int len = str.length();
        int sign = 1;
        boolean overflow = false;
        while(i<len &&(str.charAt(i)==' ' || str.charAt(i)=='\t' || str.charAt(i)=='\n'))
            ++i;
        if(i==len) return 0;
        if(str.charAt(i)=='-'){
            ++i;
            sign = -1;
        }else if(str.charAt(i)=='+')
            ++i;
        while(i<len){
            if(str.charAt(i)<'0' || str.charAt(i)>'9')
                break;
            if(ret>(Integer.MAX_VALUE-(str.charAt(i)-'0'))/10){
                overflow =true;
                break;
            }

            ret = ret*10 +(str.charAt(i)-'0');
            ++i;
        }
        if(overflow){
            ret=(sign==1)?Integer.MAX_VALUE:Integer.MIN_VALUE;
        }else{
            ret*=sign;
        }
        return ret;
    }
}
