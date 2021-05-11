/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab2;

/**
 *
 * @author skinf
 */
public class Calculate {
    
    
    public static float lab2equation(float x){
        double a=7;
        double b=-5;
        double c=-9;
        double d=8;
        
        double res = Math.sqrt(d*x) / (a * Math.pow(x, 2) + b*x + c);  
        
    return (float) res;
    }
    
    
}
