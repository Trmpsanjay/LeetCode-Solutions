// class Solution {
//     public int maxProduct(int[] nums) {
//         Arrays.sort(nums);
//         return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
        
//     }
// }


//method 2 : find two bigest num
class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int maxLow = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                maxLow = max;
                max = nums[i];
            }else if(nums[i]>maxLow){
                maxLow = nums[i];
            }
        }
        return (max-1)*(maxLow-1);
        
        
    }
}
