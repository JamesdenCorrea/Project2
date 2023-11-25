/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correamidact4;

/**
 *
 * @author Jamesden Correa
 */
public class PassbyRef {
    private int var;
    public PassbyRef()
    {
        var= 10;
    }
    public PassbyRef(int num)
    {
        var=num;
    }
    public int getValue(){
        return var;
    }
}
