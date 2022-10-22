import java.util.Scanner;
public class oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    System.out.println("Enter Numer");
    int num = sc.nextInt();

    switch(num)
    {
    case '0': System.out.println("Even");
    break;

    case '1': System.out.println("Odd");
    break;
    }
    
    } 
}
