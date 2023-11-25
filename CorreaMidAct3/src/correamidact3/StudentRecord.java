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
public class StudentRecord {
    private String name;
    private String address;
    private String sex;
    private int age;
    private int height;
    private int weight;
    private double mGrade;
    private double eGrade;
    private double sGrade;
    
    public void setName( String n){
        name = n;
    }
    public void setAddress( String a){
        address = a;
    }
     public void setSex( String s){
        sex = s;
    }
    public void setAge ( int a){
        age = a;
    }
    public void setHeight( int b){
        height = b;
    }
    public void setWeight ( int c){
        weight = c;
    }
    public void setMathGrade ( double math){
        mGrade = math;
    }
    public void setEnglishGrade ( double eng){
        eGrade = eng;
    }
    public void setScienceGrade ( double sci){
        sGrade = sci;
    }
    
    
    public String getName()
    {
        return name;
    }
    public String getAddress()
    {
        return address;
    }
    public String getSex()
    {
        return sex;
    }
    public int getAge()
    {
        return age;
    }
    public int getHeight()
    {
        return height;
    }
    public int getWeight()
    {
        return weight;
    }
    public double getMath()
    {
        return mGrade;
    }
    public double getEnglish()
    {
        return eGrade;
    }
    public double getScience()
    {
        return sGrade;
    }
    public void print(String temp){
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Sex: "+sex);
        System.out.println("Age: "+age);
        System.out.println("Height: "+height+"cm");
        System.out.println("Weight"+weight+"kg");
    }
    public void print(double mGrade, double eGrade, double sGrade)
    {
        System.out.println("M Grade: "+mGrade);
        System.out.println("E Grade: "+eGrade);
        System.out.println("S Grade: "+sGrade);
    }
}

