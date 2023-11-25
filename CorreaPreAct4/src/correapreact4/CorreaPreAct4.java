/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correapreact4;

import java.util.Scanner;

/**
 *
 * @author Jamesden Correa
 */
public class CorreaPreAct4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int ch;
        int age;
        int print;
        System.out.println("MENU \n [1] Number Operation \n [2] String Operation");
        System.out.println("Enter Choice: ");
        ch = input.nextInt();
        int i;
        
        
        switch (ch){
            case 1:
                System.out.print("AGE TEST \n Enter Age: ");
                age = input.nextInt();
                
                if (age >=0 && age <=21)
                    System.out.println("You are minor, stay home!");
                else if (age >= 22 && age <=59)
                    System.out.println("You are middle age, Show your quarantine pass.");
                else
                    System.out.println("Invalid age.");
                break;
                
            case 2:
                System.out.println("Print TEST \n Enter number: ");
                print = input.nextInt();
                for (i=1; i<=print;i++)
                    System.out.println("I love object-oriented programming!");
                            break;
            default:
                System.out.println("Invalid entry");
                break;
        }
    }
    
}
