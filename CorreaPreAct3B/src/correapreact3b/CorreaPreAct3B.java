/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correapreact3b;

import javax.swing.JOptionPane;


/**
 *
 * @author Jamesden Correa
 */
public class CorreaPreAct3B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name;
        int num;
        name = JOptionPane.showInputDialog("Enter name: ");
        JOptionPane.showMessageDialog(null, "Hello, " +name + "!");
        num = Integer.parseInt(JOptionPane.showInputDialog("Enter number: "));
        
        if (num == 1)
            JOptionPane.showMessageDialog(null, "one");
            else if (num == 2)
                    JOptionPane.showMessageDialog(null,"two");
           else if (num == 3)
                    JOptionPane.showMessageDialog(null, "three");
            else if (num == 4)        
                    JOptionPane.showMessageDialog(null, "four");
            else if (num == 5)        
                    JOptionPane.showMessageDialog(null, "five");
            else if (num == 6)        
                    JOptionPane.showMessageDialog(null, "six");
            else if (num == 7)        
                    JOptionPane.showMessageDialog(null, "seven");
            else if (num == 8)        
                    JOptionPane.showMessageDialog(null, "eight");
            else if (num == 9) 
                    JOptionPane.showMessageDialog(null, "nine");
            else if (num == 10) 
                    JOptionPane.showMessageDialog(null, "ten");
            else
            JOptionPane.showMessageDialog(null,"INVALID NUMBER");
                    
                    
    }
    }

    