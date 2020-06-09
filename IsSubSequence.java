  
class Solution {
    public boolean isSubsequence(String s, String t) {
        
        // bruteforce soln
        // // basically we have to check s is present in t in same sequence
        // //edge cases
        // // if s is null then return true
        // if(s.length()==0)
        //     return true;
        //     // if t is null then return false
        // if(t.length()==0)
        //     return false;
        //     // go to every cahrecter of t and search of every charecter of s
        // int i=0,j=0;
        // for(i=0;i<t.length() && j<s.length();i++){
        //     if(s.charAt(j)==t.charAt(i))
        //         j++;
        // }
        // // if j will be equal to s length that means every character is
        //present so return true else return false
        // if(j==s.length())
        //     return true;
        // return false;
        
        int index = -1;
        for (char c : s.toCharArray()) { // for each loop
            index = t.indexOf(c, index + 1);
            if (index == -1) return false; // if not found return false
        }
        return true;
        
        
        
    }
}
