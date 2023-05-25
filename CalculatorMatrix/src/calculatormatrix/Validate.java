/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatormatrix;

import java.util.Scanner;

/**
 *
 * @author lap21
 */
public class Validate {
    private final Scanner sc = new Scanner(System.in);

    public Validate() {
    }
     
    public int validInt(String mess, int min, int max) {
        System.out.println(mess);
        while (true) {            
            try {
                int input = Integer.parseInt(sc.nextLine().trim());
                if(input < min || input > max){
                    System.out.printf("Please input in range %d - %d\n", min, max);
                    continue;
                }
                return input;
            } catch (NumberFormatException e) {
                System.err.println("Please input an Integer number: ");
            }
            
        }
    }
}
