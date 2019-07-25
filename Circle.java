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
public class Circle {
    private double radius;
 public Circle(double radius){
 this.radius=radius<0 ? 0 :radius;
 }
 public double getRadius(){
 return radius;
 }
  public double getArea(){
  return radius * radius* Math.PI;
  
  }
  
    
}
