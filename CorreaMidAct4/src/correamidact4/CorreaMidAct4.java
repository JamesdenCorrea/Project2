/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correamidact4;

/**
 *
 * @author Jamesden Correa
 */
public class CorreaMidAct4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PassbyRef obj = new PassbyRef();
        PassbyRef obj2 = new PassbyRef(100);
        System.out.println("var is: "+obj.getValue());
        System.out.println("var is: "+obj2.getValue());
        
        
    }
    
}
