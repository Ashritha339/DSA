class Solution {
    public String mergeAlternately(String word1, String word2) {
      char arr1[]=word1.toCharArray();
      char arr2[]=word2.toCharArray();
      int n1=arr1.length;
      int n2=arr2.length;
      char arr3[]=new char[n1+n2];
      int i=0;
      int j=0;
      int k=0;
      while(i<n1&&j<n2){
        arr3[k]=arr1[i];
        k++;
        arr3[k]=arr2[j];
        k++;
        i++;
        j++;
      }
      while(i<n1){
        arr3[k]=arr1[i];
        i++;
        k++;
      }
      while(j<n2){
        arr3[k]=arr2[j];
        j++;
        k++;
      }
      return new String(arr3);

    }
}