/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab3;

import java.util.Random;

import org.springframework.stereotype.Service;

/**
 *
 * @author skinf
 */
@Service
public class lab3Task1 {
Random rand = new Random();

    public int[] task(int arrayLeng, int arrayMax){

        int[] result = new int[arrayLeng];

        for (int j = 0; j < arrayLeng; j++) {
            result[j] = rand.nextInt(arrayMax + 1);
        }

        return result;
    }

    
    
    public static int output(int[] array, int arrayMax){

        int k = 0;

        for (int j = 0; j < array.length; j++) {
            if (array[j] == arrayMax){

                k++;

            }
        }

        return  + k;

    }

    
    
    public String output2(int[] intArray) {
        String result = "{";

        for (int i : intArray) {
            result += i + ", ";
        }
        result=result.substring(0, result.length()-2);
        result += "}";
        return result;
    }
    
    
 
    
}
    


     
     
     
 
    
    