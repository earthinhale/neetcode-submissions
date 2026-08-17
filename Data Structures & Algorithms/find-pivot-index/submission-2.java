class Solution {
    public int pivotIndex(int[] nums) {
        int n= nums.length;
        if(n==0){
            return -1;
        }
        if(n==1){
            return 0;
        }
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        prefix[0] = nums[0];
        suffix[n-1] = nums[n-1];
        for(int i=1; i< n; i++){
            prefix[i] = nums[i] + prefix[i-1];
            suffix[n-i-1] = suffix[n-i] + nums[n-i-1];
        }
        if(0== suffix[1]){
            return 0;
        }
        
        for(int j=1; j<n-1; j++){
            if(prefix[j-1]==suffix[j+1]){
                return j;
            }
        }
        if(prefix[n-2]==0){
            return n-1;
        }
        return -1;
        
    }
}