 import java.util.Scanner;
public class    asl{

public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    Double  una, dalawa, tatlo, sum, ave;
    String g1, g3;
    char g2;
    System.out.println("Please enter your First Name: ");
    g1 = sc.nextLine();
     System.out.println("Please enter your Middle Name: ");
    g2 = sc.nextLine() .charAt(0); 
     System.out.println("Please enter your Last Name: ");
    g3 = sc.nextLine();

    System.out.println("Please enter your First Grade: ");
    una = sc.nextDouble();
    System.out.print("Please enter your Second Grade: ");
    dalawa = sc.nextDouble();
    System.out.println("Please enter your Third Grade: ");
    tatlo = sc.nextDouble();

    sum = una + dalawa + tatlo;
    ave = sum/3;

    System.out.println(g1 + " " + g2 + ". " + g3 + ", The total average is " + ave);
}
    
}
