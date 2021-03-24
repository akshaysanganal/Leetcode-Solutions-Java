class Solution {
    public int findNumbers(int[] nums) {
        
        int res = 0;
        
        for(int i=0; i<nums.length; i++) {
            if(hasEvenLen(nums[i]))
                res++;
        }
        
        return res;
    }
    
    public boolean hasEvenLen(int num){
        int len =0;
        while(num != 0){
            num /= 10;
            len++;
        }
        
        if(len%2 == 0)
            return true;
        
        else 
            return false;
        
    }
}