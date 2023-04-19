class Solution {
    public boolean containsDuplicate(int[] nums) {
       Set<Integer> set1=new HashSet<>();
       for(int i=0;i<nums.length;i++){
           set1.add(nums[i]);
       }
       int b=set1.size();
       if(b==nums.length){
           return false;
       }else{
           return true;
       }
    }
}