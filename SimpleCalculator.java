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
public class SimpleCalculator {
 private double firstNumber;
 private double secondNumber;
 public double getFirstNumber(){
     return firstNumber;
 }
    public double secondNumber(){
         return secondNumber;
    }
    public void setFirstNumber(double paramet1){
      firstNumber = paramet1;      
    }
     public void setSecondNumber(double paramet2){
        secondNumber   = paramet2; 
    }
     public double getAdditionResult(){
         return firstNumber + secondNumber;
     }
     public double getSubtractionResult(){
      return firstNumber - secondNumber;
     }
     public double getMultiplicationResult(){
      return firstNumber * secondNumber;
     }
     public double getDivisionResult(){
      return  secondNumber == 0 ? 0 : firstNumber / secondNumber;
     }
     
}
