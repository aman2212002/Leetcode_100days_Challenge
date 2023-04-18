class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr[]= new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++){
            arr[i]=nums1[i];
        }
        
        for(int i=nums1.length;i<nums1.length+nums2.length;i++){
            arr[i]=nums2[i-nums1.length];
        }
        Arrays.sort(arr);
        int n=nums1.length+nums2.length;
        if (n % 2 != 0){
return (double)arr[n / 2];
        }else{
return (double)(arr[(n - 1) / 2] + arr[n / 2]) / 2.0;
        }
			

		

    }
    
}