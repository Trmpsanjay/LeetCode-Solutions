//both arrays are sorted to isme ye krenge ki last wale se compare karenge jo max hoga(dono differenrt array) use apne sahi position par le jyenge and same arra ka ho to usko ek piche khiska denge

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k] = nums1[i];
                i--;
                k--;
            }
            else{
                nums1[k] = nums2[j];
                k--;
                j--;
            }
            
        }
        //copying remaining 2nd
         while(j>=0){
                nums1[k] = nums2[j];
                k--;
                j--;
            }
    }
}
