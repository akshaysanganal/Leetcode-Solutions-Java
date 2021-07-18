class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min_size = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;
        
        for(int i=0; i<nums.length; i++) {
            sum += nums[i];
            
            while(i>=left && sum >= target) {
                min_size= Math.min(min_size, i-left +1);
                sum -= nums[left];
                left++;
            }
        }
        
        return min_size == Integer.MAX_VALUE ? 0 : min_size;    
        
    }
}