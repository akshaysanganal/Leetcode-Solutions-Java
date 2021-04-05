class Solution {
    int count = 0;
    public int countSubstrings(String s) {
        
        for(int i=0; i<s.length(); i++){
            expandFromMiddle(s, i, i);
            expandFromMiddle(s, i, i+1);
        }
        
        return count;
    }
    
    public void expandFromMiddle(String s, int l, int h){
        while(l>=0 && h<s.length() && s.charAt(l)== s.charAt(h))
        {
            l--;
            h++;
            count++;
        }
    }
    
}