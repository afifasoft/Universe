import java.io.IOException;
import java.util.Scanner;

public class InputExample {


    public static void main(String args[]) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age in years: ");

        double age = scanner.nextDouble();

        System.out.println("Enter your maximum heart rate: ");
        double rate = scanner.nextDouble();

        double fb = (rate - age) * 0.65;

        System.out.println("Your target fat burning heart rate is " + fb + ".");


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer: ");

        while (!input.hasNextInt()) {
            input.nextLine();
            System.out.println("That's not an integer; please enter an integer");
        }

        int i = input.nextInt();
        System.out.println("i: "+i);

    }
}
