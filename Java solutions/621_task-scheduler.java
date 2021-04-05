class Solution {
    public int leastInterval(char[] tasks, int n) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i=0; i<tasks.length; i++){
            map.put(tasks[i], map.getOrDefault(tasks[i], 0) +1);
        }
        
        int cycle = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);
        pq.addAll(map.values());
        
        while(!pq.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            for(int i=0; i<n+1; i++) {
                if(!pq.isEmpty())
                    temp.add(pq.remove());
            }
            
            for(int i=0; i<temp.size(); i++){
                int curr = temp.get(i);
                curr -= 1;
                if(curr>0)
                    pq.add(curr);
            }
            
            if(pq.isEmpty())
                cycle += temp.size();
            else
                cycle += n+1;
            
        }
        return cycle;
        
    }
}