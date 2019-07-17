/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadania;

/**
 *
 * @author LENOVO
 */
public class Wall {
  private double width;
  private double height;        
   Wall(){
       
   }  
   Wall(double width,double height){
   this.height = height < 0 ? 0 : height;
   this.width =  width  < 0 ? 0 : width;    
   }  
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width =  width  < 0 ? 0 : width; 
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height < 0 ? 0 : height;
    }
    public double getArea(){
    return width * height;    
    }
}
