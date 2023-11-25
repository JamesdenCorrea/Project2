/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jamesden Correa
 */
public class TuitionFee {
    private String fn;
    private String ln;
    private String yrlevel;
    private double misc;
    private boolean elec;
    private boolean oop;
    private double lecfee = 0.0;
    private double labfee = 0.0;
    private boolean cash;
    private boolean ins;
    private double disc;
    
    
    public void setName(String f, String l){
        fn = f;
        ln = l;
    }
    public void setYear(String y){
        yrlevel = y;
    }
    public void setSubjects(boolean e, boolean o){
        elec = e;
        oop = o;
    }
    public void setPMode(boolean c, boolean i){
        cash = c;
        ins = i;
    }
    
    
    public String getName(){
        return ln + ", " +fn;
    }
    public double getMiscFee(){
        switch (yrlevel){
            case "First":
                misc  = 3000;
                break;
            case "Second":
                misc = 4000;
                break;
            case "Third":
                misc = 5000;
                break;
            case "Fourth":
                misc = 6000;
                break;
            default:
                misc = 0;
                break;
        }
    return misc;
    }
    public double getLecFee(){
        if (elec == true)
            lecfee = lecfee + 1000;
        if (oop == true)
            lecfee = lecfee + 1000;
        return lecfee;
    }
    public double getLabFee(){
        if (oop == true)
            labfee = labfee + 1500;
        return labfee;
    }
    public double getDisc(){
        if (cash == true)
            disc = (lecfee + labfee + misc) * 0.05;
        return disc;
    }
    public double getTF(){
        return (lecfee + labfee + misc) - disc;
    }
}
