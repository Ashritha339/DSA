class Solution {
    public double minPrice(int[] prices, int[] discounts) {
      int n1=prices.length;
      int n2=discounts.length;
      Arrays.sort(prices);
      Arrays.sort(discounts);
      int i=n1-1;
      int j=n2-1;
      double f=0;
      while(i>=0&&j>=0){
        f+=(prices[i]*(100.0-discounts[j]))/100.0;
        i--;
        j--;
      } 
      while(i>=0){
    f+=prices[i];
    i--;
      } 
      return f;
    }
}