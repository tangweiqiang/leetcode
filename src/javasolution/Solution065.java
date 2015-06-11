package javasolution;

/**
 * Created by 汤伟强 on 2015/6/11.
 */
public class Solution065 {
    public boolean isNumber(String s) {
        String regex = "[-+]?(\\d+\\.?|\\.\\d+)\\d*(e[-+]?\\d+)?";
        if(s.trim().matches(regex))
            return true;
        else return false;
    }
}
