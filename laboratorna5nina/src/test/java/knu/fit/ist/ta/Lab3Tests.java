/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta;




import knu.fit.ist.ta.lab3.lab3Task1;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author skinf
 */
@SpringBootTest
public class Lab3Tests {
    
    
    int[] test_arr1 = {1, 3, 0};
    int[] test_arr11 = {11, 4, 8, 11, 11}; 
    
    @Test
    void lab3Taskt1(){
     assertEquals(lab3Task1.output(test_arr1,3), 1);
    }
     
     @Test
    void lab3Taskt2(){
     assertEquals(lab3Task1.output(test_arr11,11), 3);
    }
}
