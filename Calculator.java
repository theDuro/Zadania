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
public class Calculator  {
private Floor floor;
private Carpet carpet;
    
public Calculator(Floor floor ,Carpet carpet){
this.carpet=carpet;
this.floor=floor;   
} 
public double getTotalCost(){
return floor.getArea()*carpet.getCost();
}   

    
}
