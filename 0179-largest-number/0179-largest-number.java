class Solution {
    public String largestNumber(int[] nums) {
         String[] numStrs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numStrs[i] = Integer.toString(nums[i]);
        }
        
       
        Arrays.sort(numStrs, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String order1 = a + b;
                String order2 = b + a;
                return order2.compareTo(order1); 
            }
        });
        
        if (numStrs[0].equals("0")) {
            return "0";
        }
       
        StringBuilder result = new StringBuilder();
        for (String numStr : numStrs) {
            result.append(numStr);
        }
        
        return result.toString();
    }
}