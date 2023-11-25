/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correa.oop.prelim.exam;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Jamesden Correa
 */
public class CORREAOOPPRELIMEXAM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int sum = 0,number;
        int ch;
        System.out.println("MENU \n [1] Number Operation \n [2] String Operation");
        System.out.print("Enter Choice: ");
        ch = input.nextInt();
        
        
        switch (ch){
            case 1:
           System.out.println("****NUMBER OPERATION****");
        for(int i = 0; i < 5; i++){
        System.out.print("Enter Number:");
        number = input.nextInt();
        sum += number;
        }
        
        System.out.println("Sum is:"+sum);
        break;
        
        
        
            case 2:
                    System.out.println("****STRING OPERATION****");
                String a [][] = {{"alone", "for", "lips", "only", "The"},{"and", "good", "look", "others", "Walk"},{"are", "in", "mouth", "poise", "With"},{"beautiful", "kindness", "never","speak","Words"},{"eyes","knowledge","of","that","you"}
            };
               System.out.println(a[0][1]+" "+a[3][0]+" "+a[4][0]+" "+a[1][2]+" "+a[0][1]+" "+a[0][4]+" "+a[1][1]+" "+a[2][1]+" "+a[1][3]+" "+a[0][1]+" "+a[3][0]+" "+a[0][2]+", "+a[3][3]+" "+a[0][3]+" "+a[3][4]+" "+a[4][2]+" "+a[3][1]+"; "+a[1][0]+" "+a[0][1]+" "+a[2][3]+" "+a[1][4]+" "+a[2][4]+" "+a[0][4]+" "+a[4][1]+" "+a[4][3]+" "+a[4][4]+" "+a[2][0]+" "+a[3][2]+" "+a[0][0]);
               break;
                default:
                System.out.println("Invalid Input");
                break;   
        }
    }
    }

                                     

      
    

