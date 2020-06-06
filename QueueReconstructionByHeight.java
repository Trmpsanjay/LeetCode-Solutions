import java.util.ArrayList;
class Solution {
    public int[][] reconstructQueue(int[][] people) {
        /*
        Algorithm:
        First sort all the people in decreasing order of their height.for those wo have same height  sort them
        in ascending order of  their k values
        Now simply iterate over the sorted array and insert them in the output array at kth index;
        
        */
        
        Arrays.sort(people,(a,b) -> a[0]==b[0] ? a[1]-b[1] : b[0]-a[0]); // this means we will sort arrays based
            //on lambda expresiion/comparator a and b if a[0]==b[0] then we are going to return a[1]-b[1] else 
            // we will return b[0]-a[0];
            
            // creating a arraylist
        ArrayList<int[]> result = new ArrayList<>();
        // iterating in the array and putting them at index k
        for(int [] p : people){  // for each loop
            result.add(p[1],p);   // p[1] = kth index
        }
        // returning the arraylist converting into array
        int ans[][] =  result.toArray(new int[people.length][2]);
       
        return ans;
        
    }
}
