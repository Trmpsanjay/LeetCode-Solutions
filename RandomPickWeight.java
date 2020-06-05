class Solution {
    
    
    /*
    basically ye ek probablitry ka question hai isme har index par us index ki weightage yani aane kitni bar         aayega ye diya hua hai. ham ise 2 tarike se kar sakte hai pahle ki ek array bnaye or usme  jitni weightage
    hai utni bar wo number dal de and uske bad random function se ek random number generate kare arr.length
    ke range me and us index par rakaha number return kar de lekin isme bahut space lag sakta hai even ye array       ke capacity se bahar bhi ja sakta hai isliye ise implement av nahi karenge;
    
    
    2
    Soln 2;
    ek naya array bnaye jo same size ka hoga lekin element uske piche tak ke weightage ka sum hoga and ab ek 
    random number generate karenge jo 0 to sum ke barabar hoga ab random number jis range me aayege us range ko
    return kar denge;
    */

    // creating an array reference to store their sum array
    int arr[];
    int sum=0;
    public Solution(int[] w) {
        // creating array
        arr = new int[w.length];
        for(int i=0;i<arr.length;i++){
            // calculating sum
            sum= sum +w[i];
            // storing sum values in the array
            arr[i] = sum;
        }
        
    }
    
    public int pickIndex() {
        // generating random number : in java it is double and return b/w 0-1 so we will multiply by sum to get
        // in or range and typecast it
        int num = (int)(sum * Math.random());
        // now searching the random number and returning the index
        for(int i=0;i<arr.length;i++){
            if(num<arr[i])
                return i;
        }
        // not come here
        return -1;
        
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */
