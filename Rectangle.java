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
public class Rectangle  {
    private double width;
    private double length;
    Rectangle(double width,double length){
     this.width = width > 0 ? width : 0;
     this.length = length > 0 ? length : 0;
    }

    /**
     * @return the width
     */
    public double getWidth() {
        return width;
    }

    /**
     * @return the length
     */
    public double getLength() {
        return length;
    }
    public double getArea(){
        return length * width;
    }
    
}
