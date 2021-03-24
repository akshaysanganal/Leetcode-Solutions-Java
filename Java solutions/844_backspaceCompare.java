class Solution {
    public boolean backspaceCompare(String S, String T) {
        String S1 = getString(S);
        String S2 = getString(T);
        return S1.equals(S2);
    }
    
    public String getString(String S){
        StringBuilder res = new StringBuilder();
        int count = 0;
        for(int i=S.length()-1; i>=0; i--){
            if(S.charAt(i)=='#'){
                count++;
            }
            else{
                if(count >0){
                    count--;
                }
                else
                    res.append(S.charAt(i)); 
            }
        }
        return res.toString();
    }
}