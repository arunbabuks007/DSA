class Solution {
    public void setZeroes(int[][] matrix) {
            int len=matrix.length;
        //BRUTE APPROACH
    //     for(int i=0;i<len;i++){
    //         for(int j=0;j<len;j++){
    //             if(matrix[i][j]==0){
    //                 markRow(i,matrix);
    //                 markCol(j,matrix);
    //             }
    //         }
    //     }
    //     for(int i=0;i<matrix.length;i++){
    //         for(int j=0;j<matrix.length;j++){
    //             if(matrix[i][j]==-1){
    //                 matrix[i][j]=0;
    //             }
    //         }
    //     }
    //     // System.out.println(matrix);
    //     return;
    // }
    // public void markRow(int i,int[][] matrix){
    //     for(int j=0;j<matrix.length;j++){
    //         if(matrix[i][j]!=0)
    //             matrix[i][j]=-1;
    //     }
    // }
    // public void markCol(int j,int[][] matrix){
    //      for(int i=0;i<matrix.length;i++){
    //         if(matrix[i][j]!=0)
    //             matrix[i][j]=-1;
    //     }
    // }

    //BETTER APPROACH
    // int[] a=new int[matrix.length];
    // int[] b=new int[matrix.length];
    // for(int i=0;i<matrix.length;i++){
    //     for(int j=0;j<matrix.length;j++){
    //         if(matrix[i][j]==0){
    //             a[i]=1;
    //             b[j]=1;
    //         }
    //     }
    // }
    
    // for(int i=0;i<matrix.length;i++){
    //     for(int j=0;j<matrix.length;j++){
    //         if(a[i]==1 || a[j]==1){
    //             matrix[i][j]=0;
    //         }
    //     }
    // }
    // return;

    //OPTIMAL APPROACH
          int rows = matrix.length;
        int cols = matrix[0].length;

        int col0 = 1;

        // Step 1: Mark rows and columns
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                if (matrix[i][j] == 0) {

                    // mark row
                    matrix[i][0] = 0;

                    // mark column
                    if (j != 0) {
                        matrix[0][j] = 0;
                    } 
                    else {
                        col0 = 0;
                    }
                }
            }
        }

        // Step 2: Traverse inner matrix
        for (int i = 1; i < rows; i++) {

            for (int j = 1; j < cols; j++) {

                if (matrix[i][j] != 0) {

                    if (matrix[i][0] == 0 || matrix[0][j] == 0) {

                        matrix[i][j] = 0;
                    }
                }
            }
        }

        // Step 3: First row
        if (matrix[0][0] == 0) {

            for (int j = 0; j < cols; j++) {

                matrix[0][j] = 0;
            }
        }

        // Step 4: First column
        if (col0 == 0) {

            for (int i = 0; i < rows; i++) {

                matrix[i][0] = 0;
            }
        }
    }
}