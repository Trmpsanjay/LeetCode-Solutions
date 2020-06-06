class Solution {
    public int removeDuplicates(int[] nums) {
        
        // this is not working for [1,1];
//         //handling edge cases
//         if(nums.length==0)
//             return 0;
//         if(nums.length==1)
//             return 1;
//        int j=0;
//         for(int i=0;i<nums.length-1;i++){
//             if(nums[i]!=nums[i+1])
//                 nums[j++]=nums[i];
            
//         }
//         // checking last element
//         if(nums[nums.length-2]==nums[nums.length-1])
//             return j;
//         else{
//             nums[j++]=nums[nums.length-1];
//             return j;
//         }
        
        //handling edge cases
        if(nums.length==0)
            return 0;
        if(nums.length==1)
            return 1;
        int j=1; // 1 because we are checking from 1
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i])
                nums[j++]=nums[i];
        }
        return j;
                
        
    }
}
