package Lab2_23_08_26;

public class Q4 {
        public static void main(String[] args) {
            int[][] tupleMatrix = {
                {7}
                
            };
    
            int[][] transposedMatrix = new int[1][1];
    
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < 1; j++) {
                    transposedMatrix[i][j] = tupleMatrix[j][i];
                }
            }
    
            System.out.println("Original Matrix:");
            printMatrix(tupleMatrix);
    
            System.out.println("\nTransposed Matrix:");
            printMatrix(transposedMatrix);
        }
    
        public static void printMatrix(int[][] matrix) {
            for (int[] row : matrix) {
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
    }
    

