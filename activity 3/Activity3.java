 import java.util.Scanner;
public class Activity3{
    public static void main(String arg[]){
            Scanner sc = new Scanner(System.in);
            double g1, g2, g3, g4, ave;
            String studname;
            int num1d;


            System.out.println("Please enter your fullname: ");
            studname = sc.nextLine();
            
             System.out.println("Please enter your student id number: ");
             num1d = sc.nextInt();

            System.out.println("Please enter your First grade: ");
                 g1 = sc.nextDouble();
                 System.out.println("Please enter your Second grade: ");
                g2 = sc.nextDouble();  
                 System.out.println("Please enter your Third grade: ");
                 g3 = sc.nextDouble(); 
                 System.out.println("Please enter your Fourth grade: ");
                 g4 = sc.nextDouble();

                ave = g1 + g2 + g3 + g4 / 4;
                System.out.println("Hello" + "," + " " + studname + "," + " Your student id is " + num1d + ", and your total average is: "+ ave );

    }      

}
