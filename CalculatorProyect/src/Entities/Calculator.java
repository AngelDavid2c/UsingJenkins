/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author angel
 */
public class Calculator {
    public int num1;
    public int num2;

    public Calculator() {
    }

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    public int addition(){
        return num1+num2;
    }
    public int substraction(){
        return num1-num2;
    }
    public int multiplication(){
        return num1*num2;
    }
    public double division(){
        return num1/num2;
    }

    @Override
    public String toString() {
        return "Calculator{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }
    
    

}
