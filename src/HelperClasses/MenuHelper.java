package HelperClasses;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brian
 */
public class MenuHelper {
    
    private MenuHelper(){
        
    }
    
    public static int displayMenu(String message, int min, int max) {
        Scanner scan = new Scanner(System.in);
        boolean hasPicked = false;
        System.out.println();
        System.out.print(message + "\n");
        int input = 0;
        System.out.print("Please enter a selection " + min + " - " + max + ": ");

        while (!hasPicked) {
            while (!scan.hasNextInt()) {
                scan.next();
                System.out.print("Value is not an integer, please input an integer: ");
            }

            input = scan.nextInt();

            if (input <= max && input >= min) {
                hasPicked = true;
            } else {
                System.out.print("Please select a valid choice between " + min + " and " + max + ": ");
            }

            
        }
        return input;
    }
    
    
    public static String getInput(String prompt){
        Scanner scan = new Scanner(System.in);
        System.out.print(prompt);
        String input = scan.next();
        
        return input;
    }
    
    
}
