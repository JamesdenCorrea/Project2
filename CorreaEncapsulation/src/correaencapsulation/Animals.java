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
public class Animals {
    private int age;
    private String name;
    private String food;
    
    public int getAge(){
    return age;
    }
    
    public String getName(){
    return name;
}
    public String getFood(){
        return food;
    }
    
    public void setAge( int a ){
        age = a;
    }
    public void setName(String n){
        name = n;
    }
    public void setFood(String f){
        food = f;
    }
}
