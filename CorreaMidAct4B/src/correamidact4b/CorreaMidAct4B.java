/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correamidact4b;

/**
 *
 * @author Jamesden Correa
 */
public class CorreaMidAct4B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StudentData myobj = new StudentData();
        System.out.println("Student Name is : "+myobj.getStdName());
        System.out.println("Student Age is :"+myobj.getStdAge());
        System.out.println("Student ID is :"+myobj.getStdID());
        
        StudentData myobj2 = new StudentData(555, "Chaitanya", 25);
        System.out.println("Student Name is : "+myobj2.getStdName());
        System.out.println("Student Age is :"+myobj2.getStdAge());
        System.out.println("Student ID is :"+myobj2.getStdID());
        
        
    }
    
}
