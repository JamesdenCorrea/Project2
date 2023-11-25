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
public class Lion extends Animal {
    public void animalsound(){
        System.out.println("Lion sound is : ROAR!!");
    }
    @Override
    public void animalcolor(String c){
      System.out.println("Lion Color:"+c);
  }
    @Override
    public void age(int a){
     System.out.println("Lion Age:"+a+"\n");
    }
}
