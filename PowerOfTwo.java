class Solution {
    public boolean isPowerOfTwo(int n) {
        //edge case
        if(n<=0)
            return false;
        // bitwise soln the bit representation of n and n-1 for power of two number will be always zero;
        return (n & (n-1)) ==0;
        
    }
}




//class Solution {
   
//     public boolean isPowerOfTwo(int n) {
//        return ((n & (n-1)) == 0 && n>0);
//     }
// }

//Brtureforce soln 
//class Solution {
//     private int pow2(int i){
//         return (int)Math.pow(2,i);
//     }
//     public boolean isPowerOfTwo(int n) {
//         for(int i=0;i<32;i++){
//             if(n==pow2(i))
//                 return true;
//             if(pow2(i)>n+1)
//                return false;
//         }
//         return false;
//     }
// }
