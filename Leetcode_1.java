class Solution{
    public int[] twoSum(int [] nums, int target){
        int[] b=new int[2];
        for(int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                int sol =target-nums[i];
                
                if(nums[j]==sol){
                     b[0]=i;
                     b[1]=j;
                    
                }
            }
        }
return b;
    }
}