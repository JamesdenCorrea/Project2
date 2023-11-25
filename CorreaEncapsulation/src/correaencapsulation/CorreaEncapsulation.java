/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correaencapsulation;

/**
 *
 * @author Jamesden Correa
 */
public class CorreaEncapsulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animals anm = new Animals();
        Animals anm1 = new Animals();
        Animals anm2 = new Animals();
        
        anm.setName("Lion");
        anm.setAge(15);
        anm.setFood("Meat");
        
        anm1.setName("Tiger");
        anm1.setAge(16);
        anm1.setFood("Chicken");
        
        anm2.setName("Wolf");
        anm2.setAge(17);
        anm2.setFood("Fish");
        
        
        System.out.println("ANIMAL 1:");
        System.out.println("Name: "+anm.getName());
        System.out.println("Age: "+anm.getAge());
        System.out.println("Food: "+anm.getFood()+"\n");
        
        System.out.println("ANIMAL 2:");
        System.out.println("Name: "+anm1.getName());
        System.out.println("Age: "+anm1.getAge());
        System.out.println("Food: "+anm1.getFood()+"\n");
        
        System.out.println("ANIMAL 3:");
        System.out.println("Name: "+anm2.getName());
        System.out.println("Age: "+anm2.getAge());
        System.out.println("Food: "+anm2.getFood());
        
    }
    
}
