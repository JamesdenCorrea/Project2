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
public class Wolf extends Animal {
    @Override
    public void animalsound(){
        System.out.println("Wolf sound is : HOWL!!!");
    }
    @Override
    public void animalcolor(String c){
      System.out.println("Wolf Color:"+c);
  }
    @Override
    public void age(int a){
     System.out.println("Wolf Age:"+a+"\n");
    }
}
