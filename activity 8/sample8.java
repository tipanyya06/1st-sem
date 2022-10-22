import java.util.Scanner;
public class sample8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 10;

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        while(count!=-1){
            int product = num * count;
            System.out.println(product);
            count--;
        }
        sc.close();
    }  
}