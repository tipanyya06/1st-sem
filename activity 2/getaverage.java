    import java.util.Scanner;
    public class getaverage{

    public static void main(String args[]){
        int g1, g2, g3, g4, ave, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Grade: ");
        g1 = sc.nextInt();
        System.out.println("Enter Second Grade: ");
        g2 = sc.nextInt();
        System.out.println("Enter Third Grade: ");
        g3 = sc.nextInt();
        System.out.println("Enter Fourt Grade: ");
        g4 = sc.nextInt();
        sum = g1 + g2 + g3 + g4;
        ave = sum/4;
        System.out.println("The total average is " + ave);
    }
    
}