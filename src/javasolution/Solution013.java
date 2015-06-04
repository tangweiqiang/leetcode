package javasolution;

public class Solution013{
    private  int[] val = new int[255];
    private void init(){
        val['I'] = 1; val['V'] = 5; val['X'] = 10; val['L'] = 50;
        val['C'] = 100; val['D'] = 500; val['M'] = 1000;
    }
    public int romanToInt(String s) {
        init();
        int len = s.length();
        int result=0;
        for (int i=0;i<len-1;i++){
            if (val[s.charAt(i)]<val[s.charAt(i+1)])
                result -= val[s.charAt(i)];
            else if (val[s.charAt(i)]>=val[s.charAt(i+1)])
                result += val[s.charAt(i)];
        }
        result += val[s.charAt(len-1)];
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution013().romanToInt("MVV"));
    }
}