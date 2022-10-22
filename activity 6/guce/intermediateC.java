import java.util.Scanner;
    public class intermediateC{
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println("Result: " + num1);
        }
        else if(num2 > num1){
            System.out.println("Result: " + num2);
        }
        else if(num1 == num2){
            System.out.println("Result: 0");
        }
        }
    }
