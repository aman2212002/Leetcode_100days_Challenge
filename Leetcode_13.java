class Solution {
    
    public   int romanToInt(String s) {
        HashMap<String, Integer> roman = new HashMap<>();
        roman.put("I", 1);
        roman.put("V", 5);
        roman.put("X", 10);
        roman.put("L", 50);
        roman.put("C", 100);
        roman.put("D", 500);
        roman.put("M", 1000);
        char[] arr = new char[s.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.charAt(i);
        }
        int sum=0;
        for (int i = 0; i < arr.length; i++) {

        if(i>0&&roman.get(String.valueOf(arr[i]))>roman.get(String.valueOf(arr[i-1]))){
sum+=roman.get(String.valueOf(arr[i]))-2*roman.get(String.valueOf(arr[i-1]));
        }else{
            sum=sum+roman.get(String.valueOf(arr[i]));
            }
            
        }
         return sum;
}
}