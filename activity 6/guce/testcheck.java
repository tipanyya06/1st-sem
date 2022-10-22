import java.util.Scanner;
    public class testcheck {
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Stephanie's Store");
        System.out.println("Enter your Name: ");
        String name = sc.nextLine();

        System.out.println("Menu:\n[B]burger-40.00\n[F]fries-30.00\n[P]pizza-200.00");
        System.out.print("Enter your Order: ");
        char order = sc.next().charAt(0);

        int burger = 40;
        int fries = 30;
        int pizza = 200;

            if(order == 'b' || order == 'B'){
                System.out.println("How many order of Burger?: ");
                int quantity = sc.nextInt();
                int total = quantity * burger;

                System.out.println("Your amount to be pay is: " + total);
                System.out.println("Enter Your Payment: ");
                int payment = sc.nextInt();
                int change;
                change = payment - total;

        if(payment >= order){
                System.out.print("Your change is " + change + " thankyou for ordering");
        }
        else if (payment < order){
            System.out.print("Insufficient funds");
    }
       if(order == 'b' || order == 'B'){
                System.out.println("How many order of Burger?: ");
                int quantity = sc.nextInt();
                int total = quantity * burger;

                System.out.println("Your amount to be pay is: " + total);
                System.out.println("Enter Your Payment: ");
                int payment = sc.nextInt();
                int change;
                change = payment - total;

        if(payment >= order){
                System.out.print("Your change is " + change + " thankyou for ordering");
        }
        else if (payment < order){
            System.out.print("Insufficient funds");
    }


        }
        }
}
