/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanienr3;

/**
 *
 * @author LENOVO
 */
public class Cylinder extends Circle  {
double height;
    public Cylinder(double rdius ,double height) {
        super(rdius);
        this.height = height < 0 ? 0 :height; ;
    }
    public double getHeight(){
    return height;
    }
    public double getVolume(){
        return getArea() * height;
    }
    
}
