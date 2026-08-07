class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
         int[]left=new int[n];
         int ans[]=new int[n];
         left[0]=1;
         ans[n-1]=1;
        for(int i=1;i<n;i++){
            left[i]=nums[i-1]*left[i-1];
            ans[n-1-i]=nums[n-i]*ans[n-i];
        } 
        
        for(int i=0;i<n;i++){
            ans[i]=left[i]*ans[i];
        } 
        return ans;
    }
}