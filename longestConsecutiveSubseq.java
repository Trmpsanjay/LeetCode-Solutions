class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
            return 0;
	    if(nums.length==1)
	        return 1;
	   Arrays.sort(nums);
	   int count = 1;
	   int maxCount =1;
	   for(int i=1;i<nums.length;i++){
	       if((nums[i-1]==nums[i])){
	           continue;
	       }
	       else if(nums[i-1]+1==nums[i]){
	           count++; 
	           //System.out.println(arr[i-1]);
	       }else{
	           count = 1;
	       }
	           
	       if(count>maxCount)
	            maxCount = count;
	   }
	   return maxCount;
        
    }
}
