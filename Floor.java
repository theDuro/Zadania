/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanianr2;

/**
 *
 * @author LENOVO
 */
public class Floor {
 private double width ; 
 private double length;
 public Floor(double width,double length){
 this.width = width < 0 ? 0 : width;  
 this.length =length < 0 ? 0 : length;
 }
 public double getArea(){
 return width*length;
 }
 
}
