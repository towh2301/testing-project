/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generateunit;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author penta
 */
public class ImplementUnit {

    public List<String> deriveSet;
    public String computeSet;
    public int totalElement;
    public int uniqueElement; 
    public int numberOfUnit;
    public String[] unit;

    

    public ImplementUnit(int numberOfUnit, String[] unit) {
        this.numberOfUnit = numberOfUnit;
        this.unit = unit;
        setComputeSet();
        setDeriveSet();
        setTotalElement();
        setUniqueElement();
    }
     public int getTotalElement() {
        return totalElement;
    }

    public void setTotalElement() {
        this.totalElement = (this.unit.length)* this.numberOfUnit;
    }

    public int getUniqueElement() {
        return uniqueElement;
    }

    public void setUniqueElement() {
        if(numberOfUnit!=0)
        this.uniqueElement = (this.unit.length -1)* this.numberOfUnit +1;
    }
    public List<String> getDeriveSet() {
        return deriveSet;
    }

    public void setDeriveSet() {
        deriveSet = new ArrayList<>();
        String s="";
        for (int i = 1; i <= numberOfUnit; i++) {
            s = "S" + i + " = {";
            for (int k = 0; k < unit.length; k++) {
                s += "<";
                for (int j = 1; j <= numberOfUnit; j++) {
                    if (j == i) {
                        s += "X" + i + unit[k] + ", ";
                    } else {
                        s += "X" + j + "nom, ";
                    }
                    if (j == numberOfUnit) {
                        s += ">";
                    }
                }
            }
            s += "}";
            deriveSet.add(s);
        }
    }

    public String getComputeSet() {
        return computeSet;
    }

    public void setComputeSet() {
        String s = this.firstCompute();
        for (int i = 1; i <= numberOfUnit; i++) {
            
            for (int k = 0; k < unit.length; k++) {
                s += "<";
                for (int j = 1; j <= numberOfUnit; j++) {
                    if(unit[k].equalsIgnoreCase("nom") && i!=1){
                        continue;
                    }else{
                    if (j == i) {
                        s += "X" + i + unit[k] + ", ";
                    } else {
                        s += "X" + j + "nom, ";
                    }
                    if (j == numberOfUnit) {
                        s += ">";
                    }
                    }
                }
                
            }
            s+="}";
        }
        this.computeSet=s;
        
    }



    public String firstCompute() {
        String s = "";
        for (int i = 1; i < this.numberOfUnit; i++) {
            s += "S" + i + " U ";
        }
        if(numberOfUnit>0)
        s += "S" + numberOfUnit + " = {";
        return s;
    }
}
