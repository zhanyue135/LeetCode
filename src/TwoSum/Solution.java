package TwoSum;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap();
        int[] result = new int[2];
        for (int i=0;i<nums.length;i++){
            int s=target-nums[i];
            if(map.containsKey(s)){
                return new int[] {i,map.get(s)};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("error");
    }
}