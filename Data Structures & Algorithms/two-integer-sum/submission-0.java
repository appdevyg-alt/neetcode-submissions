class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> hm = new HashMap<Integer,Integer> ();    
        for (int i = 0; i <nums.length;i++)
        {
        int required = target-nums[i];
        if (hm.containsKey(required))
        return new int[]{hm.get(required),i};
        else
        hm.put(nums[i],i);
        }
        return new int[]{};
        
    }
}
