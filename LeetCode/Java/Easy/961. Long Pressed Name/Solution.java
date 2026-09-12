class Solution {
    public boolean isLongPressedName(String name, String typed) {
        char arr1[]=name.toCharArray();
        char arr2[]=typed.toCharArray();
        int i=0;
        int j=0;
        int n1=arr1.length;
        int n2=arr2.length;
        
        if(n1>n2){
            return false;
        }
        
        while(i<n1&&j<n2){
            if(arr1[i]==arr2[j]){
                i++;
                j++;
            }
            else{
                if(j>0&&arr2[j]==arr2[j-1]){
                    j++;
                }
                else{
                    return false;
                }
            }
        }
        
        while(j<n2){
            if(arr2[j]==arr2[j-1]){
                j++;
            }
            else{
                return false;
            }
        }
        
        return i==n1;
    }
}