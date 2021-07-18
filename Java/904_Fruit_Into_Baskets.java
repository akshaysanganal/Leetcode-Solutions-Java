class Solution {
    public int totalFruit(int[] fruits) {
        
        HashMap<Integer, Integer> map = new HashMap<>(); 
        int left =0, max_len = 0; 
        
        for(int i=0; i<fruits.length; i++) {
            map.put(fruits[i], map.getOrDefault(fruits[i], 0) +1);
            
            while(map.size() >2) {
                int cnt = map.get(fruits[left])-1;
                if(cnt == 0) 
                    map.remove(fruits[left]);
                else
                    map.put(fruits[left], cnt);
                left++;
            }
            
            max_len = Math.max(max_len, i-left+1);
            
        }
        
        return max_len;
        
        
    }
}