class Solution {
    public int firstMissingPositive(int[] nums) {
        if(nums.length==0){
            return 1;
        }
        int ans = 1;
        
           Arrays.sort(nums);
        //   for(int i=0;i<size;i++){
        //       System.out.print(arr[i]+" ");
        //   }
           for(int i=0;i<nums.length;i++){
               if(nums[i]<=0){
                   continue;
               }
              else if(nums[i]==0){
                  continue;
              }
               else if((i+1) <=(nums.length-1) && nums[i]==ans && nums[i+1]==ans){
                   continue;
               }
               else if((i+1) <=(nums.length-1) && nums[i]==ans && nums[i+1]!=ans){
                   ans++;
               }
               else if(nums[i]!=ans)
                    return ans;
                else
                    continue;
           }
           if(nums[nums.length-1]<=0)
               return 1;
           return nums[nums.length-1]+1;

        
    }
}
