/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correamidexam;

/**
 *
 * @author Jamesden Correa
 */
public class CorreaMidExam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("PATIENT 1:");
        PatientRecord pr1 = new PatientRecord();
        System.out.println("Name:"+pr1.getName());
        System.out.println("Sex:"+pr1.getSex());
        System.out.println("Blood:"+pr1.getBlood());
        System.out.println("Kilo:"+pr1.getKilo());
        System.out.println("Height:"+pr1.getHeight());
        System.out.println("BMI:"+pr1.getBMI());
        
        System.out.println("\nPATIENT 2:");
        PatientRecord pr2 = new PatientRecord("Mikhail", "Male", "A+", 65.0, 1.64);
        System.out.println("Name:"+pr2.getName());
        System.out.println("Sex:"+pr2.getSex());
        System.out.println("Blood:"+pr2.getBlood());
        System.out.println("Kilo:"+pr2.getKilo());
        System.out.println("Height:"+pr2.getHeight());
        System.out.println("BMI:"+pr2.getBMI());
    }
}
