class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int result = Integer.MAX_VALUE;
        int left = 0;
        for(int right = 0 ; right < nums.length ; right++){
            sum += nums[right];
            while(sum >= target){
                if((right - left) + 1 < result){
                    result = (right - left) + 1;
                }
                sum -= nums[left];
                left++;
            }
           
        }
        return result != Integer.MAX_VALUE ? result : 0;
    }
}
