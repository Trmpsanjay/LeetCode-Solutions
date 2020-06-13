class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        
        /*
        
        Copied soln i haven't study dp
        
        The basic idea is like:

1. Sort
2. Find the length of longest subset
3. Record the largest element of it.
4. Do a loop from the largest element to nums[0], add every element belongs to the longest subset.
        
        
        
        */
        
        List<Integer> res = new ArrayList<Integer>();
        if (nums == null || nums.length == 0)
            return res;
        Arrays.sort(nums);
        int[] dp = new int[nums.length];
        for(int i = 0; i < dp.length; i++){
            dp[i] +=1;
        }

        for(int i = 0; i < nums.length; i++)
            for(int j = 0; j <i ; j++){
                if(nums[i] % nums[j] == 0)
                    dp[i] = Math.max(dp[i], dp[j] +1);
            }

        int maxIndex = 0;
        for (int i = 1; i < nums.length; i++)
            maxIndex = dp[i] > dp[maxIndex]? i: maxIndex;

        int temp = nums[maxIndex];
        int curDp = dp[maxIndex];
        for(int i = maxIndex; i>=0; i--){
            if(temp % nums[i] == 0 && dp[maxIndex] - dp[i] <=1){
                res.add(nums[i]);
                temp = nums[i];
                maxIndex = i;
            }
        }
        Collections.sort(res);
        return res;
        
    }
}
