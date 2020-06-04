class Solution {
    public int twoCitySchedCost(int[][] costs) {
        // int sum =0;
        // int length=costs.length;
        // int count =0;
        // for(int i=0;i<length;i++){
        //     if(count==length/2)
        //         break;
        //     if(costs[i][0]<costs[i][1])
        //             sum=sum+costs[i][0];
        // }
        // for(int j=0;j<length;j++){
        //     if(count==length)
        //         break;
        //     if(costs[j][1]<costs[j][0])
        //         sum=sum+costs[j][1];
        // }
        // return sum;
        
        /*above will not work because it is based on profit so we will sort the array based on profit : profit           means here we will calculate how much profit will be made when one is send to city a instead of b or vice         versa;
        now we will send half to city a and half to city b;
        for sorting we will use comparator which will sort based on our condition
        time complexity will be order of n(logn);
        */
        
        //sorting based on two condition a and b here a[0]-a[1] will give us maximum profit to send city them to           //interview and same for b[0]-b[1];
        // insort we have sort the arrays based on profit which we will gain if we send to city a than city b;
        Arrays.sort(costs,(a,b)->Integer.compare(a[0]-a[1],b[0]-b[1]));
        // initializing total cost
        int sum=0;
        // sending half to city a
        for(int i=0;i<costs.length/2;i++)
            sum = sum + costs[i][0];
        // sending half to city b
        for(int i=costs.length/2;i<costs.length;i++)
            sum = sum +costs[i][1];
        return sum;
    }
}
