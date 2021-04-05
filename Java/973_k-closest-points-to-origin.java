class Solution {
    public int[][] kClosest(int[][] nums, int K) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0; i< nums.length; i++){
            
            int a = nums[i][0] * nums[i][0];
            int b = nums[i][1] * nums[i][1];
            int distance = a+b;
            
             map.put(i,distance);
        }
        
        //min heap
        PriorityQueue<Map.Entry<Integer, Integer>> pq = 
                         new PriorityQueue<>((a,b)->(a.getValue()-b.getValue()));
        
        
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            pq.add(entry);
        }
        
        
        
        int res[][] = new int[K][2];
        int counter = 0;
        while(counter<K){
            Map.Entry<Integer, Integer> entry = pq.poll();
            int index = entry.getKey();
            
            res[counter] = nums[index];
            counter++;
        }
        return res;
    }
}