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
public class Main {
    public static void main(String[] args) {
        CalculatorMatrix calculator = new CalculatorMatrix();
        while (true) {            
            int choice = calculator.MainPage();
            if(choice == 4){
                return;
            }
            int matrix1[][] = calculator.inputMatrix("1");
            int matrix2[][] = calculator.inputMatrix("2");
            switch(choice){
                case 1:
                    calculator.addMatrix(matrix1, matrix2);
                    break;
                case 2:
                    calculator.subMatrix(matrix1, matrix2);
                    break;
                case 3:
                    calculator.mulMatrix(matrix1, matrix2);
                    break;
            }            
        }
    }
}
