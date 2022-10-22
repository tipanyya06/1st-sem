import java.util.Scanner;
public class myfirstjava2{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int num1, num2, sum;
       System.out.println("Pleas enter first number: "  );
       num1 = sc.nextInt();
       System.out.println("Pleas enter second number: "  );
       num2 = sc.nextInt();

       sum= num1+num2;

       System.out.println("Pleas enter first number: " +sum );

}
}