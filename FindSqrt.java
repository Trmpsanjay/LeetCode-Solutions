class Solution {
    public int mySqrt(int x) {
//         // handling edge cases;
//         if(x==0)
//             return 0;
//         if(x==1)
//             return 1;
//         int prev =0;
//         for(int i=0;i<x/2+1;i++){
//             if(i*i==x){
//                 prev = i;
//                 break;
//             }
//             else if(i*i<x)
//                 prev = i;
//             else
//                 break;
//         }
//         return prev;
            
        
    // above solution giving tle we can use binary search for it;
        // min will be zero and max will be integer max;
        
       //  handling edge cases;
        if(x==0)
            return 0;
        int si =0;
        int ei = Integer.MAX_VALUE;
        while(true){
            int mid = (si+ei)/2;
            // here x/mid because mid and x will give the square
            if(mid>(x/mid))
               ei = mid-1;
            else{
                if (mid + 1 > x/(mid + 1))
                    return mid;
                si = mid+1;
            }
               
        }
    }
}
               
        
