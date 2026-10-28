class Solution {
    public void setZeroes(int[][] arr) {
        int colzero=1;
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                    arr[i][0]=0;
                    if(j==0){
                        colzero=0;
                    }
                    else{
                        arr[0][j]=0;
                    }

                }
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(arr[i][j]!=0){
                    if(arr[0][j]==0||arr[i][0]==0){
                        arr[i][j]=0;
                    }
                }
            }
        }
        if(arr[0][0]==0){
            for(int j=0;j<m;j++){
                arr[0][j]=0;
            }
        }
        if(colzero==0){
            for(int i=0;i<n;i++){
                arr[i][0]=0;
            }
        }
    }
}