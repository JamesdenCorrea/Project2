/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correamidquiz1;
import java.util.Scanner;

/**
 *
 * @author Jamesden Correa
 */
public class CorreaMidQuiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Professor tal = new Professor();
        Professor val = new Professor();
        Professor jerome = new Professor();
        Scanner input = new Scanner(System.in);
        String pangalan;
        double sweldoPerOras;
        double OrasNgTrabaho;
        double Kaltas;
        
        System.out.println("****INPUT DATA****");
        
        System.out.println("Enter Name:");
        pangalan = input.nextLine();
        
        System.out.println("Enter Rate per hour:");
        sweldoPerOras = input.nextDouble();
        
        System.out.println("Enter Hours worked:");
            
        OrasNgTrabaho = input.nextDouble();
        System.out.println("Enter Total deductions:");
        Kaltas = input.nextDouble();
        
        tal.setName(pangalan);
        tal.setSalary(sweldoPerOras, OrasNgTrabaho, Kaltas);
        
        System.out.println("****PAYSLIP***");
        System.out.println(tal.getName()+ ",Your Gross Pay is "+ tal.getGrossPay()+ "and your Net Pay is "+tal.getNetpay());
    }
    
}
