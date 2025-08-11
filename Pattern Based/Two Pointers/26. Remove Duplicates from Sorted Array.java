// Solution 1

class Solution {
    public int removeDuplicates(int[] nums) {
        int indexForNextNumber = 1;
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] > nums[i-1]){
                nums[indexForNextNumber] = nums[i];
                indexForNextNumber++; 
            }
        }
        return indexForNextNumber;
    }
}

//Solution 2

class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int j = 1;
        for(int i = 1; i < n ; i++){
            if(nums[i] != nums[j-1]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
