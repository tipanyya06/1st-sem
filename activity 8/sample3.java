import java.util.Scanner;
public class sample3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String anyword="";

        while(!anyword.equals ("q") || anyword.equals ("Q")) {
        System.out.print("\nEnter String: ");
        anyword = sc.next().toLowerCase();
        System.out.println("Press q to quit");
}
    sc.close();
}
}