class Solution {
    /*
    A rather straight forward solution is a two-pass algorithm using counting sort.
    First, iterate the array counting number of 0's, 1's, and 2's, then overwrite array
    with total number of 0's, then 1's and followed by 2's.
    
    */
    public void sortColors(int[] nums) {
        
        
        // pointer soln
        int i=0,nextZero=0,nextTwo=nums.length-1;
        while(i<=nextTwo){
            // if zero tthen swap i with nextzero
            if(nums[i]==0){
                int temp=nums[i];
                nums[i]=nums[nextZero];
                nums[nextZero]=temp;
                i++;
                nextZero++;
            }
            // if zero tthen swap i with nextTwo
            else if(nums[i]==2){
                int temp=nums[i];
                nums[i]=nums[nextTwo];
                nums[nextTwo]=temp;
                //i++;    // here is the biggest mistake
                nextTwo--;
            }
            //if one then just increase i don't do anything
           else {
                i++;
            }
            
            
        }
        
    }
}
