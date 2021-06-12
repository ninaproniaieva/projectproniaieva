/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab6;

/**
 *
 * @author skinf
 */
public class count5numb {
    
    static int number0f5s(int n)
{
    int count = 0;
    while (n > 0)
    {
        if (n % 10 == 5)
        count++;
 
        n = n / 10;
    }
    return count;
}
 
 static int numberOf5sinRange(int n)
{
     
   
    int count = 0;
 

    for (int i = 5; i <= n; i++)
    count += number0f5s(i);
 
    return count;
}
 

public static void main(String[] args)
{
    System.out.print(numberOf5sinRange(0));
    System.out.println();
    System.out.print(numberOf5sinRange(35));
}

}
