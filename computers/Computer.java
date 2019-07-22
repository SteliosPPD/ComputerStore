/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computers;

/**
 *
 * @author tasos
 */
public abstract class Computer {
    private String brand;
    protected double price;

    public Computer(double price) {
        this.price = price;
    }

    public Computer(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    
    public String getBrand() {
        return brand;
    }

//    public void setBrand(String brand) {
//        this.brand = brand;
//    }

    public double getPrice() {
        return price;
    }

    protected abstract void setPrice(double price);
    
    
    
}






