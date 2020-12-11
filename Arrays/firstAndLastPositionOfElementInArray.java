// class Solution {
//     public int[] searchRange(int[] nums, int target) {
        
//         if(nums.length==0){
//             int ans[] = {-1,-1};
//             return ans;
//         }
        
//         int low = 0;
//         int high = nums.length-1;
//         while(low<=high){
//             int mid = (low+high)/2;
//             if(nums[mid]==target){
//                 if(mid+1<nums.length && nums[mid+1]==target){
//                     int arr[] = {mid,mid+1};
//                     return arr;
//                 }
//                 else if(mid-1>=0 && nums[mid-1]==target){
//                     int arr[] = {mid-1,mid};
//                     return arr;
//                 }
//                 else{
//                     int arr[] = {mid,mid};
//                     return arr;
//                 }
//             }
//             else if(nums[mid]>target){
//                 high = mid-1;
//             }
//             else{
//                 low = mid+1;
//             }
//         }
//         int arr[] = {-1,-1};
//         return arr;
        
//     }
//// }


class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        int start = -1;
        int last = -1;
        while(i<nums.length){
            if(nums[i]==target){
               start = i;
                break; 
            }
            else
                i++;
        }
         while(j>=0){
            if(nums[j]==target){
                last = j;
                break;
            }
             else
                 j--;
        }
        int arr[] = {start,last};
        return arr;
    }
}
