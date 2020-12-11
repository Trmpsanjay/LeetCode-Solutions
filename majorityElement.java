class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        Arrays.sort(nums);
        int i=0;
        int ansMax =-1;
        int count =0;
        while(i+1<=nums.length-1){
            
            if(nums[i]==nums[i+1]){
                count++;
                if(count>=(nums.length)/2){
                    ansMax = nums[i];
                }
            }
            else{
                count=0;
            }
            i++;
        }
        return ansMax;
        
    }
}
