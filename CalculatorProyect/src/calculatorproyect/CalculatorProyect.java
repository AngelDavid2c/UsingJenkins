/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorproyect;

import Entities.Calculator;

/**
 *
 * @author angel
 */
public class CalculatorProyect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Calculator nueva = new Calculator(9,3);
     
       System.out.println(nueva.addition() + " "+  nueva.substraction() + " " +  nueva.multiplication() + " " + nueva.division());
     

        
    
    }
    

}
