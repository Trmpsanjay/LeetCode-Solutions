class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length()==0){
            return 0;
        }
        int count = 0;
        int length = s.length()-1;
        int i = s.length()-1;
        while(s.charAt(i)==' '){
            length--;
            i--;
            if(i<0)
                return 0;
        }
        for(int j=length;j>=0;j--){
            if(s.charAt(j) ==' ')
                break;
            else
                count++;
        }
        return count;
    }
}
