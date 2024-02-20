/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commission;

/**
 *
 * @author penta
 */
public final class Material {
    private int[] units;
    public int nom;
    private int cost;
    

   

    public Material(int unit,int max,int cost) {
        this.cost= cost;
        int[] unit5 ={1,2,max/2,max-1,max};
        nom=max/2;
        int[] unit7 = {0,1,2,max/2,max-1,max,max+1};
        if(unit== 5){
            units= unit5;
        }else{
            units=unit7;
        }
        
        
    }

    public int[] getUnits() {
        return units;
    }

    public void setUnits(int[] units) {
        this.units = units;
    }
    
    
}
