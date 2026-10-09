class Solution {
    public int missingNumber(int[] nums) {
        
        //List<Integer>  nums = List.toArray(nums);
        Arrays.sort(nums);

        int counter = 0;

        for (int i = 0 ;i<nums.length;i++)
        {
            if (nums[i]!=counter)
            return counter;
            else if (nums[i]==counter)
            counter++;

        }
        return  counter;
    }
}
