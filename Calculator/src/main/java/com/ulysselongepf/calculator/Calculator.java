/**
 * TP0 Partie 3
 * 18 Septembre 2023
 */

package com.ulysselongepf.calculator;

import java.util.Scanner;

/**
 *
 * @author Ody
 */
public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        //Demande + Test de réponse à l'opération
        boolean condition = true;
        int operateur = 0;
        while(condition){
            System.out.println("\n Please enter the operator:\n 1) add\n 2) substract\n 3) multiply\n 4) divide\n 5) modulo");
            operateur = sc.nextInt(); // On demande a sc de donner l'opération voulue
            if (operateur > 5 || operateur == 0) {
            //pas compris entre 1 et 5
            System.out.println("Input error, please enter a valid answer");  
        } else {
                condition = false;  
        }      
        }
       
        System.out.println("Please enter the first value :");
        int operande1 = sc.nextInt(); // On demande la première valeur
        System.out.println("Please enter the second value :");
        int operande2 = sc.nextInt(); // On demande la deuxieme valeur
        
        switch (operateur) { 
            case 1: //Addition
                System.out.println("The result of" + operande1 + " + " + operande2 + " is : "+(operande1+operande2));
                break;
            case 2: //Soustraction
                System.out.println("The result of " + operande1 + " - " + operande2 + " is : "+(operande1-operande2));
                break;
            case 3: //Multiplication
                System.out.println("The result of " + operande1 + " x " + operande2 + " is : "+(operande1*operande2));
                break;
            case 4: //Division
                if (operande2 ==0) {
                    System.out.println("It is impossible to divide by 0, end of the program");
                    break;
                }
                System.out.println("The result of " + operande1 + " divided by " + operande2 + " is : "+(operande1/operande2));
                break;
            case 5: //Modulo
                if (operande2 ==0){
                   System.out.println("It is impossible to divide by 0, end of the program");
                   break; 
                }
                System.out.println("The result of  " + operande1 + " modulo " + operande2 + " is : "+(operande1%operande2));
                break;
            default: //else
                break;
        }
        
        
        





    }
}
