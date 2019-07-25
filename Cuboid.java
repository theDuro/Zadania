/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadnr3;

/**
 *
 * @author LENOVO
 */
public class Cuboid extends Rectangle {
    private double height;

    public Cuboid(double width, double length,double height) {
        super(width, length);
        this.height = height > 0 ? height : 0 ;
    }
    public double getHeight(){
     return height;   
    }
    public double getVolume(){
     return getArea()*height;   
    }
    
}
