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
public class Tiger extends Animal {
    @Override
    public void animalsound(){
        System.out.println("Tiger sound is : GROWL!!");
    }
    @Override
    public void animalcolor(String c){
      System.out.println("Tiger Color:"+c);
  }
    @Override
    public void age(int a){
     System.out.println("Tiger Age:"+a+"\n");
    }
}
