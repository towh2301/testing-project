/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commission;

/**
 *
 * @author penta
 */
public class Comission {
    private int lock;
    private int stock;
    private int barrel;
    private double expected;

    public Comission(int lock, int stock, int barrel, double expected) {
        this.lock = lock;
        this.stock = stock;
        this.barrel = barrel;
        this.expected = expected;
    }

    public int getLock() {
        return lock;
    }

    public int getStock() {
        return stock;
    }

    public int getBarrel() {
        return barrel;
    }

    public double getExpected() {
        return expected;
    }
}
