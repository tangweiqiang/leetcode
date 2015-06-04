package javasolution;

import java.util.Arrays;

/**
 * Created by 汤伟强 on 2015/6/3.
 */
public class Solution001 {
    public int[] twoSum(int[] numbers, int target) {
        int[] index = {-1,-1};
        int[] num = numbers.clone();
        int i=0,j=numbers.length-1;
        Arrays.sort(num);
        while(i<j){
            if((num[i]+num[j]) == target){
                int count=0,index1 = 0,index2=0;
                for(int a=0;a<numbers.length;a++)
                {
                    if(numbers[a]==num[i]||numbers[a]==num[j])
                    {
                        count++;
                        if(count==2)
                        {
                            index2=a;
                            index[0] = (index1<index2?index1:index2)+1;
                            index[1] = (index1>index2?index1:index2)+1;
                            return index;
                        }
                        else
                        {
                            index1=a;
                        }

                    }
                }

            }else if((num[i]+num[j]) > target){
                j--;
            }else{
                i++;
            }
        }
        return index;
    }
}
