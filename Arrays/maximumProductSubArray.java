class Solution {
    public int maxProduct(int[] nums) {
       //modified kadanes algoritm
        //edge case
        if(nums.length==0)
            return 0;
        if(nums.length==1)
            return nums[0];
       int maxProduct = 0;
       int currProduct = 1;
       for(int i =0; i<nums.length;i++){
           currProduct = currProduct*nums[i];
           maxProduct = Math.max(currProduct,maxProduct);
           if(currProduct==0)
            currProduct = 1;
       }
       
       //reverse bcz in case of [3,-1,25] gives wrong answer
      currProduct = 1;
      for(int i= nums.length-1;i>=0;i--){
            currProduct = currProduct*nums[i];
            maxProduct = Math.max(currProduct,maxProduct);
            if(currProduct==0)
                currProduct = 1;
      }
      return maxProduct;
        
    }
}
