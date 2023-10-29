class Solution {
    public int largestAltitude(int[] gain) {
        int arr[]= new int[gain.length+1];
        arr[0]=0;
        int n=arr.length;
        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]+gain[i-1];
        }
        
       Arrays.sort(arr);
        return arr[arr.length-1];
    }
}