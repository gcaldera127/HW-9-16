import java.util.*;
import java.lang.Math;
import java.io.*;

public class Calculator {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        char operator;
        double answer = 0.0;

        Scanner scanObj = new Scanner(System.in);

        System.out.println("Enter first number:");
        num1 = scanObj.nextInt();
        System.out.println("Want to square that number? Yes or No ");
            if(answer.equals "Yes"){
                int square = Math.pow(num1, 2);
            } else {
                break;
            }    
        System.out.println("Enter second number:");
        num2 = scanObj.nextInt();
        System.out.println("What operation to use?");
        operator = scanObj.next().charAt(0);

        switch (operator) {
            case '+': answer = num1 + num2;
                break;
            case '-': answer = num 1 - num2;
                break;
            case '*': answer = num1 * num2;
                break;
            case '/': answer = num1/num2;
            break;
        }


    }
    class MagicCalculator extends Calculator{
        //square a number
        static long squareRoot(int num1) 
        { 
            int x = num1; 
            int y = 1; 
            while (x > y) { 
                x = (x + y) / 2; 
                y = n / x; 
             } 
        return (long)x; 
        } 
        // find the sin of a number
        public static double sin(double num1)
        double a = num1;  
        double b = Math.toRadians(num1); 
        System.out.println(Math.sin(b)); 

        //find the cosine of a number

        public static double cos(int num1)
        double a = num1;  
        double b = Math.toRadians(num1); 
        System.out.println(Math.cos(b)); 


        //find the tangent of a number
        public static double atan(double num1)
        double num1 = Math.PI / 2;
        num1 = Math.toRadians(num1);
        System.out.println("Math.atan(" + num1 + ")" + Math.atan(num1));

        //find the factorial of a number
        int i,fact=1;  
        int number=num1;    
        for(i=1;i<=number;i++){    
            fact=fact*i;    
        }    
        System.out.println("Factorial of "+number+" is: "+fact);    
       }  

    }
}

