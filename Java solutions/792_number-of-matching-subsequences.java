class Solution {
    public int numMatchingSubseq(String S, String[] words) {

        
        int count =0;
        
        for(int i=0; i<words.length; i++){
                if(isSubsequence(words[i],S))
                    count++;
        }
            
        
        return count;        
    }

    public boolean isSubsequence(String s, String t) {
        
        char a[] = s.toCharArray();
        char b[] = t.toCharArray();
        int j= 0;
        for(int i= 0; i< b.length; i++){
            if(j== a.length)
                return true;
            if(b[i] == a[j])
                j++;
        }
        
        if(j== a.length)
            return true;
        else 
            return false;
        
    }

}

