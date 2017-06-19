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
        int fourthValue = 0;
        int fifthValue = 0;
        int sixthValue = 0;
        int tempValue1 = 0;
        int pointsValue = 0;
        double calcValue1 = 0;
        double calcValue2 = 0;
        double result1 = 0;
        String myString = "";
        String myString2 = "";
        
        Scanner in = new Scanner(System.in); 
       /* System.out.println("Task 1");
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
        drawStars();
        
        System.out.println("Task 4");
        System.out.println("Check, if number is belongs to defined range - 1 to 30");
        System.out.println("Please enter number");
        firstValue = in.nextInt(); 
        
        if (firstValue > 1 && firstValue < 30) 
        { 
            System.out.println("Value is belong to defined range");
        } 
        else 
        { 
            System.out.println("Value is not belong to defined range");
        }
        drawStars();
        
        
        System.out.println("Task 5");
        System.out.println("Check, if entered number is even or odd");
        System.out.println("Please enter number");
        firstValue = in.nextInt(); 
        System.out.println((firstValue % 2 == 0) ? ("Entered number is even") : ("Entered number is odd"));
        
        drawStars();
        
        System.out.println("Task 6");
        System.out.println("Check, if entered, five-digit number is palindrome");
        System.out.println("Please enter number");
        firstValue = in.nextInt(); 
        
        secondValue = firstValue / 10000;
        thirdValue = firstValue / 1000 % 10;
        fourthValue = firstValue % 1000 / 100 % 10;
        fifthValue = firstValue % 10000 % 1000 % 100 / 10;
        sixthValue = firstValue % 10000 % 1000 % 100 % 10;
        if (secondValue == sixthValue && thirdValue == fifthValue)
        {
          System.out.printf("%d is a palindrome \n", firstValue);
        }
        else
        {
            System.out.printf("%d is not a palindrome \n", firstValue);
        }
        drawStars();
        
        System.out.println("Task 7");
        System.out.println("Check weekday number. Sunday is beginning");
        System.out.println("Please enter number");
        firstValue = in.nextInt();
        if (firstValue == 1)
        {
            System.out.println("Entered day is Sunday");
        }
            else if (firstValue == 2)
            {
                System.out.println("Entered day is Monday");
            }
                else if (firstValue == 3)
                {
                    System.out.println("Entered day is Tuesday");
                }
                    else if (firstValue == 4)
                    {
                        System.out.println("Entered day is Wednesday");
                    }
                        else if (firstValue == 5)
                        {
                            System.out.println("Entered day is Thursday");
                        }
                            else if (firstValue == 6)
                            {
                                System.out.println("Entered day is Friday");
                            }
                                else
                                {
                                    System.out.println("Entered day is Saturday");
                                }
        drawStars();
        
        
        System.out.println("Task 8");  
        System.out.println("Let's find - do you have a lucky ticket");  
        System.out.println("Please input line of 6 digits from your ticket ");
        Scanner inp = new Scanner(System.in);
        myString = inp.nextLine();
        //Парсинг строки в числа по позициям - '0' - код символа, равный 48
        int a = myString.charAt(0)- '0';
        int b = myString.charAt(1)- '0';
        int c = myString.charAt(2)- '0';
        int d = myString.charAt(3)- '0';
        int e = myString.charAt(4)- '0';
        int f = myString.charAt(5)- '0';
        //int summLeft = 0;
        //int summRight = 0;
        //summLeft = (a + b + c);
        //summRight = (d + e + f);
        if (( a + b + c )==( d + e + f )) {
            System.out.println("You've got a lucky ticket");
        }
            else {
                System.out.println("Your ticket is not lucky");
        }
        drawStars();
        
        System.out.println("Task 9");  
        System.out.println("Let's find which playing card number is entered");  
        System.out.println("Please input number from 0 to 35");
        String mySuite = "";
        firstValue = in.nextInt();
        
        if (firstValue >= 27) // which suit are entered
        {
            mySuite = "\u2663 Clubs ";
        }
        else if ((firstValue < 27) && (firstValue >= 18))
        {
            mySuite = "\u2666 Diamonds ";
        }
        else if ((firstValue <= 17) && (firstValue > 8))
        {
            mySuite = "\u2665 Hearts ";
        }
        else
        {
            mySuite = "\u2660 Spades ";
        }

        switch(8 - ( firstValue % 9 )) //Nominee of card
        {
            case 0:
            {
                myString2 = "Ace of ";
                break;
            }
            case 1:
            {
                myString2 = "King of ";
                break;
            }
            case 2:
            {
                myString2 = "Queen of ";
                break;
            }
            case 3:
            {
                myString2 = "Jack of ";
                break;
            }
            case 4:
            {
                myString2 = "10 of ";
                break;
            }
            case 5:
            {
                myString2 = "9 of ";
                break;
            }
            case 6:
            {
                myString2 = "8 of ";
                break;
            }
            case 7:
            {
                myString2 = "7 of ";
                break;
            }
            case 8:
            {
                myString2 = "6 of ";
                break;
            }
        }
        
        System.out.println(myString2 + mySuite);
        drawStars();
        
        System.out.println("Task 10");
        System.out.println("Lets find your ideal weight with recommendations");
        System.out.println("Please enter your height");
        firstValue = in.nextInt();
        System.out.println("Please enter your weight");
        secondValue = in.nextInt();
        System.out.println("Your ideal weight is " + (firstValue - 110));
        if ((firstValue - 110) < secondValue)
        {
            tempValue1 = (firstValue - 110)- secondValue;
            System.out.println("You have to loss " + Math.abs(tempValue1) + " kilos");
        }
        else
        {   tempValue1 = secondValue - (firstValue - 110);
            System.out.println("You have to gain " + Math.abs(tempValue1) + " kilos");
        }
        drawStars();*/
       
       
        System.out.println("Task 11");
        System.out.println("Game - \"Who wants to be a millionarie\"");
        System.out.println("You have to answer 15 questions");
        System.out.println("After each right answer your points will be increased");
        System.out.println("Costs of questions are: ");
        System.out.println("1st question costs 500 points");
        System.out.println("2nd question costs 1000 points");
        System.out.println("3rd question costs 2000 points");
        System.out.println("4th question costs 3000 points");
        System.out.println("5th question costs 5000 points");
        System.out.println("6th question costs 7500 points");
        System.out.println("7th question costs 10000 points");
        System.out.println("8th question costs 15000 points");
        System.out.println("9th question costs 25000 points");
        System.out.println("10th question costs 50000 points");
        System.out.println("11th question costs 75000 points");
        System.out.println("12th question costs 150000 points");
        System.out.println("13th question costs 250000 points");
        System.out.println("14th question costs 500000 points");
        System.out.println("15th question costs 1000000 points\n\n");
        
        System.out.println("1st question");
        System.out.println("How many bits in byte?");
        System.out.println("Press \"1\" for 2 bits");
        System.out.println("Press \"2\" for 4 bits");
        System.out.println("Press \"3\" for 6 bits");
        System.out.println("Press \"4\" for 8 bits");
        firstValue = in.nextInt();
        
        switch(firstValue)
        {
            case 1:
                pointsValue = 0;
                break;
            case 2:
                pointsValue = 0;
                break;
            case 3:
                pointsValue = 0;
                break;
            case 4:
                pointsValue = pointsValue + 500;
                break;
        }
        
        System.out.println("2nd question");
        System.out.println("How many bits in Java long primitive?");
        System.out.println("Press \"1\" for 32 bits");
        System.out.println("Press \"2\" for 64 bits");
        System.out.println("Press \"3\" for 48 bits");
        System.out.println("Press \"4\" for 128 bits");
        firstValue = in.nextInt();
        
        switch(firstValue)
        {
            case 1:
                pointsValue = pointsValue;
                break;
            case 2:
                pointsValue = pointsValue + 1000;
                break;
            case 3:
                pointsValue = pointsValue;
                break;
            case 4:
                pointsValue = pointsValue;
                break;
        }
        
        System.out.println("3rd question");
        System.out.println("How many bits in IPv4 address?");
        System.out.println("Press \"1\" for 8 bits");
        System.out.println("Press \"2\" for 16 bits");
        System.out.println("Press \"3\" for 32 bits");
        System.out.println("Press \"4\" for 4 bits");
        firstValue = in.nextInt();
        
        switch(firstValue)
        {
            case 1:
                pointsValue = pointsValue;
                break;
            case 2:
                pointsValue = pointsValue;
                break;
            case 3:
                pointsValue = pointsValue + 2000;
                break;
            case 4:
                pointsValue = pointsValue;
                break;
        }
        
        System.out.println("4th question");
        System.out.println("How many bits in IPv4 mask?");
        System.out.println("Press \"1\" for 32 bits");
        System.out.println("Press \"2\" for 0 bits");
        System.out.println("Press \"3\" for 8 bits");
        System.out.println("Press \"4\" for 4 bits");
        firstValue = in.nextInt();
        
        switch(firstValue)
        {
            case 1:
                pointsValue = pointsValue + 3000;
                break;
            case 2:
                pointsValue = pointsValue;
                break;
            case 3:
                pointsValue = pointsValue;
                break;
            case 4:
                pointsValue = pointsValue;
                break;
        }
                
        System.out.println("5th question");
        System.out.println("How many bits in IPv6 address?");
        System.out.println("Press \"1\" for 32 bits");
        System.out.println("Press \"2\" for 64 bits");
        System.out.println("Press \"3\" for 128 bits");
        System.out.println("Press \"4\" for 256 bits");
        firstValue = in.nextInt();
        
        switch(firstValue)
        {
            case 1:
                pointsValue = pointsValue;
                break;
            case 2:
                pointsValue = pointsValue;
                break;
            case 3:
                pointsValue = pointsValue + 5000;
                break;
            case 4:
                pointsValue = pointsValue;
                break;
        }
        
        System.out.println("6th question");
        System.out.println("How much max hops in standard Windows traceroute?");
        System.out.println("Press \"1\" for 10 hops");
        System.out.println("Press \"2\" for 30 hops");
        System.out.println("Press \"3\" for 50 hops");
        System.out.println("Press \"4\" for 100 hops");
        firstValue = in.nextInt();
        
        switch(firstValue)
        {
            case 1:
                pointsValue = pointsValue;
                break;
            case 2:
                pointsValue = pointsValue + 7500;
                break;
            case 3:
                pointsValue = pointsValue;
                break;
            case 4:
                pointsValue = pointsValue;
                break;
        }
        
        System.out.println("th question");
        System.out.println("?");
        System.out.println("Press \"1\" for ");
        System.out.println("Press \"2\" for ");
        System.out.println("Press \"3\" for ");
        System.out.println("Press \"4\" for ");
        firstValue = in.nextInt();
        
        switch(firstValue)
        {
            case 1:
                pointsValue = pointsValue;
                break;
            case 2:
                pointsValue = pointsValue;
                break;
            case 3:
                pointsValue = pointsValue;
                break;
            case 4:
                pointsValue = pointsValue;
                break;
        }
        
        System.out.println("th question");
        System.out.println("?");
        System.out.println("Press \"1\" for ");
        System.out.println("Press \"2\" for ");
        System.out.println("Press \"3\" for ");
        System.out.println("Press \"4\" for ");
        firstValue = in.nextInt();
        
        switch(firstValue)
        {
            case 1:
                pointsValue = pointsValue;
                break;
            case 2:
                pointsValue = pointsValue;
                break;
            case 3:
                pointsValue = pointsValue;
                break;
            case 4:
                pointsValue = pointsValue;
                break;
        }
        
        System.out.println("th question");
        System.out.println("?");
        System.out.println("Press \"1\" for ");
        System.out.println("Press \"2\" for ");
        System.out.println("Press \"3\" for ");
        System.out.println("Press \"4\" for ");
        firstValue = in.nextInt();
        
        switch(firstValue)
        {
            case 1:
                pointsValue = pointsValue;
                break;
            case 2:
                pointsValue = pointsValue;
                break;
            case 3:
                pointsValue = pointsValue;
                break;
            case 4:
                pointsValue = pointsValue;
                break;
        }
        
        System.out.println("th question");
        System.out.println("?");
        System.out.println("Press \"1\" for ");
        System.out.println("Press \"2\" for ");
        System.out.println("Press \"3\" for ");
        System.out.println("Press \"4\" for ");
        firstValue = in.nextInt();
        
        switch(firstValue)
        {
            case 1:
                pointsValue = pointsValue;
                break;
            case 2:
                pointsValue = pointsValue;
                break;
            case 3:
                pointsValue = pointsValue;
                break;
            case 4:
                pointsValue = pointsValue;
                break;
        }
        
        System.out.println("th question");
        System.out.println("?");
        System.out.println("Press \"1\" for ");
        System.out.println("Press \"2\" for ");
        System.out.println("Press \"3\" for ");
        System.out.println("Press \"4\" for ");
        firstValue = in.nextInt();
        
        switch(firstValue)
        {
            case 1:
                pointsValue = pointsValue;
                break;
            case 2:
                pointsValue = pointsValue;
                break;
            case 3:
                pointsValue = pointsValue;
                break;
            case 4:
                pointsValue = pointsValue;
                break;
        }
        
        System.out.println("th question");
        System.out.println("?");
        System.out.println("Press \"1\" for ");
        System.out.println("Press \"2\" for ");
        System.out.println("Press \"3\" for ");
        System.out.println("Press \"4\" for ");
        firstValue = in.nextInt();
        
        switch(firstValue)
        {
            case 1:
                pointsValue = pointsValue;
                break;
            case 2:
                pointsValue = pointsValue;
                break;
            case 3:
                pointsValue = pointsValue;
                break;
            case 4:
                pointsValue = pointsValue;
                break;
        }
        
        System.out.println("th question");
        System.out.println("?");
        System.out.println("Press \"1\" for ");
        System.out.println("Press \"2\" for ");
        System.out.println("Press \"3\" for ");
        System.out.println("Press \"4\" for ");
        firstValue = in.nextInt();
        
        switch(firstValue)
        {
            case 1:
                pointsValue = pointsValue;
                break;
            case 2:
                pointsValue = pointsValue;
                break;
            case 3:
                pointsValue = pointsValue;
                break;
            case 4:
                pointsValue = pointsValue;
                break;
        }
        
        System.out.println("th question");
        System.out.println("?");
        System.out.println("Press \"1\" for ");
        System.out.println("Press \"2\" for ");
        System.out.println("Press \"3\" for ");
        System.out.println("Press \"4\" for ");
        firstValue = in.nextInt();
        
        switch(firstValue)
        {
            case 1:
                pointsValue = pointsValue;
                break;
            case 2:
                pointsValue = pointsValue;
                break;
            case 3:
                pointsValue = pointsValue;
                break;
            case 4:
                pointsValue = pointsValue;
                break;
        }
        
        System.out.println("th question");
        System.out.println("?");
        System.out.println("Press \"1\" for ");
        System.out.println("Press \"2\" for ");
        System.out.println("Press \"3\" for ");
        System.out.println("Press \"4\" for ");
        firstValue = in.nextInt();
        
        switch(firstValue)
        {
            case 1:
                pointsValue = pointsValue;
                break;
            case 2:
                pointsValue = pointsValue;
                break;
            case 3:
                pointsValue = pointsValue;
                break;
            case 4:
                pointsValue = pointsValue;
                break;
        }
        
        System.out.println(pointsValue);
}
    
}  
        
        
    
    

