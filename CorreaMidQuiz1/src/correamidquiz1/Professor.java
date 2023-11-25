/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correamidquiz1;

/**
 *
 * @author Jamesden Correa
 */
public class Professor {
    private String name;
    private double rph;
    private double hw;
    private double td;
    
    public void setName(String n){
        name = n;
    }
    public void setSalary(double r,  double h, double t){
        rph = r;
        hw = h;
        td = t;
        
    }
    public double getGrossPay(){
        
        return rph * hw;
    }
    public double getNetpay(){
        return rph * hw - td;
    }
    public  String getName(){
        return name;
    }
}
