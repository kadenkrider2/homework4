import java.util.Scanner;

public class hw04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("PLease enter a sequence of integers no longer than five digits: ");
        int number = input.nextInt();

        // Convert the integer to a string
        String numberString = Integer.toString(number);

        // Print the digits with spaces between them
        for (int i = 0; i < numberString.length(); i++) {
            System.out.print(numberString.charAt(i) + " ");
        }
    }
}
