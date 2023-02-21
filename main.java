
//import scanner
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // create scanner object
        Scanner input = new Scanner(System.in);
        // prompt user for input
        System.out.println("Enter a number: ");
        // store input in variable
        int num = input.nextInt();
        // print out the number
        System.out.println("You entered: " + num);
        input.close();
        double a = 3.14;
    }
}
