import java.util.Scanner;
public class DegreeName {
    public static void main(String[]args)
    {
        /* I Have Modified the code by adding
        student number in addition to degree
        name
        */
        String Name,Degree;

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter your Name: ");
        Name = input.nextLine();

        System.out.print("Your Degree Program: ");
        Degree = input.nextLine();


      /*In the below line the Integer is denoted in the same place
      rather than denoting in the first place of the program
       */
        System.out.print("Your Student Number ");
        int Snumber  = input.nextInt();

        System.out.println("");
        System.out.println("Your Name is: " +Name);
        System.out.println("");
        System.out.println("Your Degree Program is " +Degree);
        System.out.println("");
        System.out.println("Your Student Number is:  " +Snumber);

    }
}
