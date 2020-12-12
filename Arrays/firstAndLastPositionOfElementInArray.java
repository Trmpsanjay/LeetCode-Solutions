class Solution {
    public int modifiedBinary1(int nums[],int target){
        int low = 0;
        int high = nums.length-1;
        int index = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]>target){
                high = mid-1;
            }
            else if(nums[mid]<target){
                low = mid+1;
            }
            else{
                index = mid;
                low = mid+1;
            }
        }
        return index;
        
    }
     public int modifiedBinary2(int nums[],int target){
        int low = 0;
        int high = nums.length-1;
        int index = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]>target){
                high = mid-1;
            }
            else if(nums[mid]<target){
                low = mid+1;
            }
            else{
                index = mid;
                high = mid-1;
            }
        }
         return index;
        
    }
    public int[] searchRange(int[] nums, int target) {
        
        if(nums.length==0){
            int ans[] = {-1,-1};
            return ans;
        }
        int firstIndex = modifiedBinary2(nums,target);
        int lastIndex = modifiedBinary1(nums,target);
        int ans[] = {firstIndex,lastIndex};
        return ans;
        

        
    }
}


// class Solution {
//     public int[] searchRange(int[] nums, int target) {
//         int i=0;
//         int j=nums.length-1;
//         int start = -1;
//         int last = -1;
//         while(i<nums.length){
//             if(nums[i]==target){
//                start = i;
//                 break; 
//             }
//             else
//                 i++;
//         }
//          while(j>=0){
//             if(nums[j]==target){
//                 last = j;
//                 break;
//             }
//              else
//                  j--;
//         }
//         int arr[] = {start,last};
//         return arr;
//     }
// }
