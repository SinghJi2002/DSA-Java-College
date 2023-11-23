package Lab2_23_08_26;

import java.util.Scanner;

public class Q2 {

    public static void Count(int dimension,int[][] matrix){
        int count=0;
        for(int p=0;p<dimension;p++){
            for(int q=0;q<dimension;q++){
                if(matrix[p][q]!=0){
                    count++;
                }
            }
        }
        System.out.println("Number of non-zero elements are "+count);
    }

    public static void UpperTriangle(int dimension,int[][] matrix){
        System.out.println("Upper Triangular Matrix Element");
        for(int i=0;i<dimension;i++){
            for(int j=0;j<dimension;j++){
                if(j<=i){
                    continue;
                }
                else{
                    System.out.println(matrix[i][j]);
                }
            }
        }
    }

    public static void upperLowerDiagonal(int dimension,int[][] matrix){
        for(int x=0;x<dimension;x++){
            for(int y=0;y<dimension;y++){
                if(x==0 && x==y){
                    System.out.println("Row "+x);
                    System.out.println("Lower");
                    System.out.println(matrix[x+1][y]);
                }
                else if(x==dimension-1 && x==y){
                    System.out.println("Row "+x);
                    System.out.println("Upper");
                    System.out.println(matrix[x-1][y]);
                }
                else if(x==y){
                    System.out.println("Row "+x);
                    System.out.println("Upper");
                    System.out.println(matrix[x-1][y]);
                    System.out.println("Lower");
                    System.out.println(matrix[x+1][y]);
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the dimension of square matrix");
        Scanner sc=new Scanner(System.in);
        int dimension=sc.nextInt();
        int matrix[][]=new int[dimension][dimension];
        for(int a=0;a<dimension;a++){
            for(int b=0;b<dimension;b++){
                System.out.println("Enter element");
                int element=sc.nextInt();
                matrix[a][b]=element;
            }
        }
        //Upper triangular Matrix
        UpperTriangle(dimension,matrix);
        //Non-Zero Element
        Count(dimension,matrix);
        //Element just above and below the main diagonal
        upperLowerDiagonal(dimension, matrix);
        
    }
}
