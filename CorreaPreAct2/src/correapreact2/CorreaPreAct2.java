/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correapreact2;

import java.io.*;

/**
 *
 * @author Jamesden Correa
 */
public class CorreaPreAct2 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader dataIn = new BufferedReader(new InputStreamReader (System.in));
        String temp;
        int num1 , num2 , num3;
        double avg;
        System.out.print("Enter your name: ");
        temp = dataIn.readLine();
        System.out.println("Hello!, " + temp);
        System.out.print("Enter your first exam grade: ");
        num1 = Integer.parseInt(dataIn.readLine());
        System.out.print("Enter your second exam grade: ");
        num2 = Integer.parseInt(dataIn.readLine());
        System.out.print("Enter your third exam grade: ");
        num3 = Integer.parseInt(dataIn.readLine());
        
        avg = (num1 + num2 + num3) / 3;
        System.out.println("Average is : "+avg);
        
        if (avg >= 60)
            System.out.print("Average is "+avg + ". :)");
        else
            System.out.print("Average is "+avg + ". :(")
        
        
        
        
        
    }
    
}
