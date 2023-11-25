/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correamidact3;

/**
 *
 * @author Jamesden Correa
 */
public class CorreaMidAct3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StudentRecord annaRecord = new StudentRecord();
        
        annaRecord.setName("Anna");
        annaRecord.setAddress("Binan");
        annaRecord.setSex("Female");
        annaRecord.setAge(20);
        annaRecord.setHeight(160);
        annaRecord.setWeight(50);
        annaRecord.setMathGrade(90);
        annaRecord.setEnglishGrade(80);
        annaRecord.setScienceGrade(85);
        
        annaRecord.print(annaRecord.getName());
        annaRecord.print(annaRecord.getMath(), annaRecord.getEnglish(), annaRecord.getScience()); 
    }
    
}
