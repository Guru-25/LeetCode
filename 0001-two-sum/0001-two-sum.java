import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int alt=target-nums[i];
            if(hm.containsKey(alt)){
                return new int[]{i,hm.get(alt)};
            }
            hm.put(nums[i],i);
        }
        return null;
    }
}