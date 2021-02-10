class Solution {
    public int binarySearch(int nums[],int target,int si,int ei){
        if(ei<si){
            return -1;
        }
        int mid = (si+ei)/2;
        if(nums[mid]==target)
            return mid;
        else if(nums[mid]>target){
            return binarySearch(nums,target,si,mid-1);
        }
        else
            return binarySearch(nums,target,mid+1,ei);
    }
    
    public int search(int[] nums, int target) {
       return binarySearch(nums,target,0,nums.length-1); 
    }
}
