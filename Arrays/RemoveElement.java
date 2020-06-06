class Solution {
    public int removeElement(int[] nums, int val) {
      
        /*
        link : https://leetcode.com/problems/remove-element/
        Algorithm :
        in this case we have to overwrite only those element in array which is not equal to given value;
        and this will print upto only those indexes which we have return
        */
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val)
                nums[j++]=nums[i];
        }
        return j;
    }
}
