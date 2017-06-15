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
    
    public static void drawStars() throws InterruptedException {
        // Cool ending of task with running asterisks
        char charDraw = '*';
        for (int i = 0; i < 40; i++) 
        {
         System.out.print(charDraw);
         Thread.sleep(250);
        }
        System.out.println(charDraw);
        };

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        
        int firstValue = 0;
        int secondValue = 0;
        int thirdValue = 0;
        double calcValue1 = 0;
        double calcValue2 = 0;
        double result1 = 0;
        
        Scanner in = new Scanner(System.in); 
        /*System.out.println("Task 1");
        System.out.println("Find lesser value from two numbers");
        System.out.println("Please enter first number");
        firstValue = in.nextInt();  
        System.out.println("Please enter second number");
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
        drawStars();
              
        System.out.println("Task 2");
        System.out.println("Find lesser value from three numbers");
        System.out.println("Please enter first number");
        firstValue = in.nextInt();  
        System.out.println("Please enter second number");
        secondValue = in.nextInt();  
        System.out.println("Please enter third number");
        thirdValue = in.nextInt();  
        
        if (firstValue < secondValue && firstValue < thirdValue)
        {
            System.out.println("First value is smallest");
        }
        else if (secondValue < thirdValue)
        {
            System.out.println("Second value is smallest");
        }
        else
        {
            System.out.println("Third value is smallest");
        }
        drawStars();
        
        
        System.out.println("Task 3");
        System.out.println("Simple Calculator");
        System.out.println("Please enter first fractional number");
        calcValue1 = in.nextDouble();  
        System.out.println("Please enter second fractional number");
        calcValue2 = in.nextDouble();  
        System.out.println("Please enter desired action\n 1 - Addition \n 2 - Substraction \n 3 - Multiplication \n 4 - Division");
        firstValue = in.nextInt(); 
        switch(firstValue)
                {
            case 1:
                System.out.println("Summ of two values is " + (calcValue1 + calcValue2));
                break;
                
            case 2:
                System.out.println("Substraction of two values is " + (calcValue1 - calcValue2));
                break;
                
            case 3:
                System.out.println("Multiplication of two values is " + (calcValue1 * calcValue2));
                break;
                
            case 4:
                System.out.println("Division of two values is " + (calcValue1 / calcValue2));
                break;
                
        }
        drawStars();*/
    }
    
}
