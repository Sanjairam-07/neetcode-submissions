class Solution {
    public static void rotate(int[][] m,int n){
        for(int i=0;i<n/2;i++){
            int[] temp=m[i];
            m[i]=m[n-i-1];
            m[n-1-i]=temp;
        }
    }
    public void rotate(int[][] matrix) {
        int r=matrix.length;
        rotate(matrix,r);
        for(int i=0;i<r;i++){
            for(int j=i;j<r;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
}
