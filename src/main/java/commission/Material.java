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
    private int[] unit5;
    private int[] unit7;
    private int cost;
    public int[] getUnit5() {
        return unit5;
    }

    public void setUnit5(int[] unit5) {
        this.unit5 = unit5;
    }

    public int[] getUnit7() {
        return unit7;
    }

    public void setUnit7(int[] unit7) {
        this.unit7 = unit7;
    }

    public Material(int max,int cost) {
        this.cost= cost;
        int[] unit5 ={1,2,max/2,max-1,max};
        int[] unit7 = {0,1,2,max/2,max-1,max,max+1};
        setUnit5(unit5);
        setUnit7(unit7);
    }
    
    
}
