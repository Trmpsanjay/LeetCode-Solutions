class Solution {
    public int maxSubArray(int[] nums) {
         int currentSum = nums[0];
        int overAllSum = nums[0];
        for(int i=1;i<nums.length;i++){ //i =1 bcz 0 phle hi consider kar liye hai
    //here make currensum 2 case +ve and -ve and arr[i] , +ve and -ve on comparing gettingbelow result
            if(currentSum>=0)
                currentSum = currentSum+nums[i];
            else{
                currentSum = nums[i];
            }
            
            // if currentsum>=overallsum update overallSum;
            if(currentSum>=overAllSum){
                overAllSum = currentSum;
            }
        }
        return overAllSum;
        
    }
}
