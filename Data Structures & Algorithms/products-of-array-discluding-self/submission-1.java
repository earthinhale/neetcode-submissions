class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output= new int[n];
        int [] prefix= new int[n];
        prefix[0]=1;
        int[] suffix = new int[n];
        suffix[n-1]=1;
        int prod=1;
        if(n==0){
            return new int[0];
        }
        for(int j=0; j<n-1; j++){
            prefix[j+1] = nums[j]*prefix[j];
            suffix[n-j-2]= nums[n-j-1]*suffix[n-j-1];
        }
        for(int i=0; i< n; i++){
           output[i]= suffix[i] *prefix[i];
        }
        return output;
    }
}  
