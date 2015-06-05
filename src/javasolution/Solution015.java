package javasolution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * Created by 汤伟强 on 2015/6/5.
 */
public class Solution015 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result= new ArrayList<>();
        if (nums.length < 3) return result;
        Arrays.sort(nums);
        for (int i = 0; i <nums.length-2 ; i++) {
            if (i>0 && nums[i]==nums[i-1])
                continue;
            int first = i+1;
            int last = nums.length - 1;
            while (first<last){
                if (nums[i]+ nums[first] + nums[last] > 0)
                    last--;
                else if (nums[i]+ nums[first] + nums[last] < 0)
                    first++;
                else {
                    result.add(Arrays.asList(nums[i], nums[first], nums[last]));
                    while (first<last && nums[first] == nums[first+1]) first++;
                    while (first<last && nums[last] == nums[last-1]) last--;
                    first++;
                    last--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-2,0,1,1,2};
        System.out.println(new Solution015().threeSum(nums));
    }
}
