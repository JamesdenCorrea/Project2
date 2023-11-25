/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correamidact1;

/**
 *
 * @author Jamesden Correa
 */
public class Operation {
    // declaration
    private int num1;
    private int num2;
    private int product;
    private int quotient;
    private String name;
    
    // mutator method
    
    public void setName(String n)
    {
        name = n;
    }
    public void setNum1(int n1)
    {
        num1 = n1;
    }
    public void setNum2(int n2)
    {
        num2 = n2;
    }
    public void setProduct(int n3)
    {
        product = n3;
    }
    public void setQuotient(int n4)
    {
        quotient = n4;
    }
    // accessor method
    public String getName()
    {
        return name;
    }
    public int getSum(){
        return num1 + num2;
    }
    public int getDifference(){
        return num1 - num2;
    }
    public int getProduct(){
        return product = num1 * num2;
    }
    public int getQuotient(){
        return quotient = num1 / num2;
    }
}

    

