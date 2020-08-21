/*
try to implement using xor operation
*/

class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
        }
         int ans = (nums.length*(nums.length+1))/2;
        return ans-sum;
        
        
    }
}
