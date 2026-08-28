class Solution {
    public void setZeroes(int[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        // Kou kou row/column zero heba store kariba
        boolean[] zeroRow = new boolean[rows];
        boolean[] zeroCol = new boolean[cols];
        for(int i=0;i<rows;i++)//to find the positions where zeroes are there
        {
            for(int j=0;j<cols;j++)
            {
                if(matrix[i][j]==0)
                {
                    zeroRow[i]=true;
                    zeroCol[j]=true;
                }
            }
        }
        for(int i=0;i<rows;i++)//jou row zero heba then pura row ku zero karidiya
        {
            if(zeroRow[i]){
                for(int j=0;j<cols;j++){
                    matrix[i][j]=0;
                }
            }
        }
        for(int j=0;j<cols;j++)//jou column zero heba then make pura column zero karidiya
        {
            if(zeroCol[j])
            {
                for(int i=0;i<rows;i++)
                {matrix[i][j]=0;}
            }
        }
        
    }
}