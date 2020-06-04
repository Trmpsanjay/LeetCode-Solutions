class Solution {
    public int[] plusOne(int[] digits) {
        
        // handling edge cases;
//         // this cas will be always faced when 9,99,999,comes;
//         if(digits.length==1){
//             if(digits[0]==9){
//                 int ans[]={1,0};
//                 return ans;
//             }
//             digits[0]++;
//             return digits;
//         }
    
//         if(digits[digits.length-1]==9){
//             digits[digits.length-2]++;
//             digits[digits.length-1]=0;
//             return digits;
//         }
//         else{
//             digits[digits.length-1]++;
//             return digits;
//         }
        
        
        
        // now check throughout the length if less than 9 then increase by one
        //else create one new  array and make first digit 1
        
        for(int i=digits.length-1;i>=0;i--){
            // check if last digit is less than 9 add it to one and return
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            // if the last digits are 9 then make one before 1
            // ye utna bar hi execute hoga jitna bar 9 aayega agar 9 
            //nahi aaya to upar se return ho jayega
            digits[i]=0;
                
        }
        // if all digits are 9 then make a new array of size length+1 and make first digit 1
        
        int ans [] = new int[digits.length+1];
        ans[0]=1;
        return ans;
        
    }
}
