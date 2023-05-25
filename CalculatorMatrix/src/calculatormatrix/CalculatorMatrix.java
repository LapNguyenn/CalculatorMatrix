/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatormatrix;

/**
 *
 * @author lap21
 */
public class CalculatorMatrix {
    private final Validate validate = new Validate();
    
    public int MainPage() {
            System.out.println("1. Addition Matrix");
            System.out.println("2. Subtraction Matrix");
            System.out.println("3. Multiplication Matrix");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");
            int choice = validate.validInt("Enter your choice: ",1, 4);
            return choice;
    }    
    
    public int[][] inputMatrix(String n){
        System.out.println("Enter matrix " + n);
        int row = validate.validInt("Enter max row of matrix " + n + ": ", 1, Integer.MAX_VALUE);
        int col = validate.validInt("Enter max column of matrix " + n + ": ", 1, Integer.MAX_VALUE);
        int matrix[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = validate.validInt("Enter element [" + i + "]" + "[" + j + "]: ", 0, Integer.MAX_VALUE);
            }
        }
        return matrix;
    }
    
    public void displayMatrix(int [][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println("");
        }        
    }
    
    public void addMatrix(int [][] matrix1, int [][] matrix2){
        displayMatrix(matrix1);
        System.out.println("+");
        displayMatrix(matrix2);
        System.out.println("=");
        int row1 = matrix1.length;
        int col1 = matrix1[0].length;
        int row2 = matrix2.length;
        int col2 = matrix2[0].length;
        if(row1 == row2 && col1 == col2){
            for (int i = 0; i < row1; i++) {
                 for (int j = 0; j < col1; j++) {
                     System.out.print("[" + (matrix1[i][j] + matrix2[i][j]) + "]");
                 }
                 System.out.println();
             }            
        }else{
            System.err.println("Can't add 2 matrix have different size!");
        }
    }
    public void subMatrix(int [][] matrix1, int [][] matrix2){
        displayMatrix(matrix1);
        System.out.println("-");
        displayMatrix(matrix2);
        System.out.println("=");
        int row1 = matrix1.length;
        int col1 = matrix1[0].length;
        int row2 = matrix2.length;
        int col2 = matrix2[0].length;
        if(row1 == row2 && col1 == col2){
            for (int i = 0; i < row1; i++) {
                 for (int j = 0; j < col1; j++) {
                     System.out.print("[" + (matrix1[i][j] - matrix2[i][j]) + "]");
                 }
                 System.out.println();
             }            
        }else{
            System.err.println("Can't subtract 2 matrix have different size!");
        }
    }
    
    public void mulMatrix(int [][] matrix1, int [][] matrix2){
        displayMatrix(matrix1);
        System.out.println("*");
        displayMatrix(matrix2);
        System.out.println("=");
        int row1 = matrix1.length;
        int col1 = matrix1[0].length;
        int row2 = matrix2.length;
        int col2 = matrix2[0].length;
        if(col1 == row2){
            int [][]result = new int[row1][col2];
            
                for (int i = 0; i < row1; i++) {
                    for (int j = 0; j < col2; j++) {
                        result[i][j] = 0;
                    }
                }
                for (int i = 0; i < row1; i++) {
                    for (int j = 0; j < col2; j++) {
                        for (int k = 0; k < col2; k++) {
                            result[i][k] += matrix1[i][k] * matrix2[k][j];
                        }
                    }
                }
            displayMatrix(result);
        }else{
            System.err.println("Can't multiple these 2 matrix!");
        }
    }
}
