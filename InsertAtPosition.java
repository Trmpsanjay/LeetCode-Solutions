class Solution {
   // private int helper(int[], int target,int si,int ei){
        //edge case handling
       // if(nums[0]>target)
         //   return 0;
       // if(nums[nums.length-1]<target)
            //return nums.length;
        // base case 
        //int ans =0 ;
        //while(si<=ei){
            //int mid = (si+ei)/2;
           // if(nums[mid]
    //}
    
    
    // basically it is a bunary serach
    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid] == target)
               return mid;
            else if(nums[mid] > target)
               high = mid-1;
            else 
               low = mid+1;
        }
        return low;

        
    }
}
