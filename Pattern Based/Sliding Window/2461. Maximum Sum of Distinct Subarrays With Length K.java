class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long currSum = 0;
        long maxSum = 0;
        int left = 0;
        Set<Integer> set = new HashSet<>();
        for(int right = 0 ; right < nums.length ; right++){
            while(set.contains(nums[right]) || set.size() == k){
                set.remove(nums[left]);
                currSum -= nums[left];
                left++;
            }
            currSum += nums[right];
            set.add(nums[right]);
            if(set.size() == k){
                maxSum = Math.max(maxSum , currSum);
            }
        }
        return maxSum;
    }
}
