class Solution {
    
    // note : same logic that i have done in fibonnacci dynamic programing i.e O(Math.pow(2,n))
    
    /*
    Algorithm : we have an array of coins  and an amount  and with the help of coins we have 
    to make that amount in all possible combinations in this we cane do one thing :
    for a coin i we can either include it or not include it and further we call recursion to give us output
    and we pass amount = amount-i in further recursive call
    base case will be amount==0 then it will be part of our ans otherwise not;
    2n base case if amount becomes<0 simply return 0 
     in some cases we may face TLE because of same function calling of same pair again so we will sore the result in table
     and check if allready called then we will not call this function again
    
    */
    public int change(int amount, int[] coins) {
        int table[][] = new int[coins.length][amount+1];
        //we will initialize arrays -1 to check wether result is stored or not
        for(int i=0;i<coins.length;i++)
            Arrays.fill(table[i],-1);
        return change(coins,0,amount,table);
    }
    
    private  int change(int coins[],int si,int amount ,  int table[][]){ // giving starting index which either
        //we will include or exclude
        if(amount==0)
            return 1;
        if(amount<0 || si==coins.length )
            return 0;
        // if allready have ans jus return
        if(table[si][amount]!=-1)
            return table[si][amount];
        //store the result in arrays
        table[si][amount] = change(coins,si,amount-coins[si],table) + change(coins,si+1,amount,table);// when not included
            return table[si][amount];
    
    
    
//     public int change(int amount, int[] coins) {
//         return cc(coins, 0, amount);
//     }
    
//     int cc(int[] coins, int i, int amount){
//         if(amount == 0) return 1;
//         if(amount < 0 || i == coins.length) return 0;
        
//         return cc(coins, i, amount - coins[i]) + cc(coins, i + 1, amount);
        
   }
}
