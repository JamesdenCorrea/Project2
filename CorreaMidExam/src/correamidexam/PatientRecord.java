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
public class PatientRecord {
    private String name;
    private String sex;
    private String blood;
    private double kilo;
    private double height;
    
    public PatientRecord(){
        name = "Crystal";
        sex = "Female";
        blood = "O+";
        kilo = 58.0;
        height = 1.5;
    }
    public PatientRecord(String n, String s, String b, double k, double h){
        name = n;
        sex = s;
        blood = b;
        kilo = k;
        height = h;
        
    }
    
    public void setName(String n){
        name = n;
    }
    public void setSex(String s){
        sex = s;
    }
    public void setBlood(String b){
        blood = b;
    }
    public void setRecord(double k, double h){
        kilo = k;
        height = h;
        
    }
    public double getBMI(){
        return kilo / (height * height);
    }
    public  String getName(){
        return name;
    }
    public String getSex(){
        return sex;
    } 
    public String getBlood(){
        return blood;
    }
    public double getKilo(){
        return kilo;
    }
    public double getHeight(){
        return height;
    }
}
