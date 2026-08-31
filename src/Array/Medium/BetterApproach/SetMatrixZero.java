package Array.Medium.BetterApproach;

public class SetMatrixZero {
    public static void main(String[] args) {
         /*
         Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0. You must do it in place.


            Example 1

            Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]

            Output: [[1,0,1],[0,0,0],[1,0,1]]

            Explanation:

            Element at position (1,1) is 0, so set entire row 1 and column 1 to 0.
                      */
           int f,e;
           int[][] matrix={{1,1,1},{1,0,1},{1,1,1}};
           boolean[] rows=new boolean[matrix.length];
           boolean[] col=new boolean[matrix[0].length];

           for(int i=0;i<matrix.length;i++){
               for(int j=0;j<matrix[0].length;j++){
                   if(matrix[i][j]==0){
                      rows[i]=true;
                      col[j]=true;
                   }
               }
           }

        for(int i=0;i<matrix.length;i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(rows[i] || col[j]){
                    matrix[i][j]=0;
                }
            }
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
            }

    }
}
