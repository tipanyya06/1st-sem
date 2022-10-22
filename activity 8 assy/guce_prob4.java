import java.util.Scanner;
public class guce_prob4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0, num=0;

        do{sum+=num;
            System.out.print("\nEnter Number: ");
            num = sc.nextInt();
            System.out.println("The Value of Number is "+num);
        }while (num>0);
            System.out.println("\nThe total of all positive numbers is " +sum);
    } 
}