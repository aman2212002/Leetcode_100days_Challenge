class Solution {
    public int maxProfit(int[] prices) {
       int maxSoFar = 0;
       int maxEndingHere = 0;
        
        for (int i=1;i<prices.length;i++){
            maxEndingHere += prices[i] - prices[i-1];
            
            if (maxEndingHere < 0){
   maxEndingHere = 0;

            }
                         
            if (maxSoFar < maxEndingHere){
                maxSoFar = maxEndingHere;
            }
                
        }
            
        
        return maxSoFar;
    }
}