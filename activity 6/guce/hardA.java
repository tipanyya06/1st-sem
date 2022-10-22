import java.util.Scanner;
    public class hardA{
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to java store");
        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Menu");
        System.out.println("[C] - Coffeee 15.00");
        System.out.println("[M] - Milk 50.00");
        System.out.println("[T] - Tea 25.00");
        System.out.println("Enter your order: ");
        char order = sc.next().charAt(0);

        int coffee = 15;
        int milk = 50;
        int tea = 25;

       if(order == 'c' || order == 'C'){
        System.out.println("How many order of Coffee");
        int quantity = sc.nextInt();
        int total = quantity * coffee;

        System.out.println("The total amount to be pay is " + total);
        System.out.println("Enter your payment: ");
        int payment = sc.nextInt();

        int change;
        change = payment - total;
            if(payment >= total){
                System.out.println("Your change is: " + change + "Thankyou for ordering");
            }
            else if(payment < total){
                System.out.println("Insufficient funds");
            }

       }
            
       else if(order == 'm' || order == 'M'){
        System.out.println("How many order of milk");
        int quantity = sc.nextInt();
        int total = quantity * milk;

        System.out.println("The total amount to be pay is " + total);
        System.out.println("Enter your payment: ");
        int payment = sc.nextInt();
        int change;
        change = payment - total;
            if(payment >= total){
                System.out.println("Your change is: " + change + "Thankyou for ordering");
            }
            else if(payment < total){
                System.out.println("Insufficient funds");
            }
       }


       else if(order == 't' || order == 'T'){
        System.out.println("How many order tea");
        int quantity = sc.nextInt();
        int total = quantity * tea;

        System.out.println("The total amount to be pay is " + total);
        System.out.println("Enter your payment: ");
        int payment = sc.nextInt();
        int change;
        change = payment - total;
            if(payment >= total){
                System.out.println("Your change is: " + change + "Thankyou for ordering");
            }
            else if(payment < total){
                System.out.println("Insufficient funds");
            }
       }
       
        }
    }
