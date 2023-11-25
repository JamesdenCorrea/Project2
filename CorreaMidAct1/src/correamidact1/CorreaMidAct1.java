/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correamidact1;

/**
 *
 * @author Jamesden Correa
 */
public class CorreaMidAct1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //object of class operations
        Operation no1 = new Operation();
        Operation no2 = new Operation();
        
        // value to class methods
        no1.setName("James");
        no1.setNum1(10);
        no1.setNum2(5);

        
        System.out.println("Name: "+ no1.getName());
        System.out.println("Sum is: "+ no1.getSum());
        System.out.println("Difference is: "+ no1.getDifference());
        System.out.println("Product is: "+ no1.getProduct());
        System.out.println("Quotient is: "+ no1.getQuotient());
        
        no2.setName("Ploy");
        no2.setNum1(19);
        no2.setNum2(17);

        
        System.out.println("Name: "+ no2.getName());
        System.out.println("Sum is: "+ no2.getSum());
        System.out.println("Difference is: "+ no2.getDifference());
        System.out.println("Product is: "+ no2.getProduct());
        System.out.println("Quotient is: "+ no2.getQuotient());
        
        
        
        
        
       
    }
    
}
