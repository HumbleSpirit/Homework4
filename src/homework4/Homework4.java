/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework4;

import java.util.Scanner;

/**
 *
 * @author sergey
 */
public class Homework4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int firstValue = 0;
        int secondValue = 0;
        int thirdValue = 0;
        
        Scanner in = new Scanner(System.in); 
        System.out.println("Task 1");
        System.out.println("Find lesser value from two numbers");
        System.out.println("Please enter first number");
        firstValue = in.nextInt();  
        System.out.println("Please enter first number");
        secondValue = in.nextInt();  
        if (firstValue < secondValue)
        {
            System.out.println("First value lesser than second");
        }
        else if (firstValue > secondValue)
        {
            System.out.println("First value bigger than second");
        }
        else 
        {
            System.out.println("Values are equal");
        }
              
        System.out.println("Task 2");
        System.out.println("Find lesser value from two numbers");
        System.out.println("Please enter first number");
        firstValue = in.nextInt();  
        System.out.println("Please enter first number");
        secondValue = in.nextInt();  
        if (firstValue < secondValue)
        {
            System.out.println("First value lesser than second");
        }
        else if (firstValue > secondValue)
        {
            System.out.println("First value bigger than second");
        }
        else 
        {
            System.out.println("Values are equal");
        }
        

        // TODO code application logic here
 
    }
    
}
