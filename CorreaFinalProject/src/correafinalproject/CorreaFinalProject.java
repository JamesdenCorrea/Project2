/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correafinalproject;

/**
 *
 * @author Jamesden Correa
 */
public class CorreaFinalProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal ref;
        Tiger anm1 = new Tiger();
        Lion anm2 = new Lion();
        Wolf anm3 = new Wolf();

        anm1.animalsound();
        anm1.animalcolor("Orange");
        anm1.age(12);
        
        anm2.animalsound();
        anm2.animalcolor("Yellow-gold");
        anm2.age(13);
        
        anm3.animalsound();
        anm3.animalcolor("Gray");
        anm3.age(14);
    }
    
}
