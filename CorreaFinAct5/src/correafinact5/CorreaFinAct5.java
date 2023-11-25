/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correafinact5;

/**
 *
 * @author Jamesden Correa
 */
public class CorreaFinAct5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person ref;
        Employee empObj = new Employee();
        Student studObj = new Student();
        City cityObj = new City();
        empObj.name = "James";  
        studObj.name = "Correa";
        cityObj.name = "Calamba";
        
        
        ref = empObj;
        System.out.println(empObj.getName());
        ref = studObj;
        System.out.println(studObj.getName());
        ref = cityObj;
        System.out.println(cityObj.getName());
    }
    
}
