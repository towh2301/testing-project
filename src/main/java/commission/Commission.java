/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commission;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author penta
 */
public class Commission {
        Material mt;
    public Commission(int locks,int stocks,int barrels,int costLock, int costStock,int costBarrel) {
        setMaterial(locks, costLock);
        setMaterial(barrels, costBarrel);
        setMaterial(stocks, costStock);
    }
    

    public void setMaterial(int material,int cost) {
        mt = new Material(material, cost);
       
    }
        
        
}
