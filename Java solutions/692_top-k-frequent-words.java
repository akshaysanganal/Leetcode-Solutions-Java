class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String s : words)
        {
            if(!map.containsKey(s))
                map.put(s,1);
            else
                map.put(s, map.get(s)+1);
        }
        
        PriorityQueue<Map.Entry<String, Integer>> pq = 
                         new PriorityQueue<>((b, a) -> a.getValue()==b.getValue() ? b.getKey().compareTo(a.getKey()) : a.getValue()-b.getValue());
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            pq.add(entry);
        }
        
        List<String> res = new ArrayList<>();
        
        while(res.size() < k){
            Map.Entry<String,Integer> entry = pq.poll();
            res.add(entry.getKey());
        }
        
        return res;
        
    }
}