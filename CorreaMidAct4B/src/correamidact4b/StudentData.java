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
public class StudentData {
    private int StdID;
    private String StdName;
    private int StdAge;
    StudentData()
    {
        StdID = 100;
        StdName = "New Student";
        StdAge = 18;
        
    }
    StudentData(int num1, String str, int num2)
    {
        StdID = num1;
        StdName = str;
        StdAge = num2;
    }
    public int getStdID(){
        return StdID;
    }
    public void setStdID(int StdID){
        this.StdID = StdID;
        
    }
    public String getStdName(){
        return StdName;
    }
    public void setStdName(String StdName){
        this.StdName = StdName;
    }
    public int getStdAge(){
        return StdAge;
    }
    public void setStdAge(int StdAge){
        this.StdAge = StdAge;
    }
}








