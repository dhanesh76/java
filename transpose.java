public class Main{
    public static void main(String args[]){
        int matrix [][] = 
                        {
                            {5,  1,  9,  11},
                            {2,  4,  8,  10},
                            {13, 3,  6,  7},
                            {15, 14, 12, 16}
                        };
        int r = matrix.length;
        
        for(int i=0;i<r;i++){
            for(int j=i+1;j<r;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
                
            }
        }
        
        for(int row[] : matrix){
            for(int col : row){
                System.out.print(col+"\t");
            }
            System.out.println();
        }
        
    }
}
