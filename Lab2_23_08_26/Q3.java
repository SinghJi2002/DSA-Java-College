package Lab2_23_08_26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q3 {

    public static int[][] sparseMatrix(int[][] sparse,int rows,int cols,int sparseRow,int sparseColumns){
        int currRow=0;
        int currColumn=0;
        int tupleMatrix[][]=new int[sparseRow][sparseColumns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(sparse[i][j]!=0){
                    tupleMatrix[currRow][currColumn]=i+1;
                    currColumn=currColumn+1;
                    tupleMatrix[currRow][currColumn]=j+1;
                    currColumn=currColumn+1;
                    tupleMatrix[currRow][currColumn]=sparse[i][j];
                    currRow=currRow+1;
                    currColumn=0;
                }
            }
        }
        return(tupleMatrix);
    }

    public static void main(String[] args) {
        int sparseColumns=3;
        int sparseRow=0;
        System.out.println("Enter the number of rows and columns you want");
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int columns=sc.nextInt();
        int sparseMatrix[][]=new int[row][columns];
        for(int i=0;i<row;i++){
            for(int j=0;j<columns;j++){
                System.out.println("Enter elements");
                int element=sc.nextInt();
                if(element!=0){
                    sparseRow++;
                }
                sparseMatrix[i][j]=element;
            }
        }
        int matrix[][]=new int[row][columns];
        int tupleMatrix[][]=sparseMatrix(sparseMatrix,row,columns,sparseRow,sparseColumns);
        for(int i=0;i<tupleMatrix.length;i++){
            System.out.println(Arrays.toString(tupleMatrix[i]));
        }
    }

    
}
