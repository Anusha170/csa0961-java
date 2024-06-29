import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter N value: ");
        int n = scanner.nextInt();

        System.out.print("Enter " + n + " digit number: ");
        int number = scanner.nextInt();

        int sum = number;
        while (sum >= 10) {
            sum = sumOfDigits(sum);
        }

        System.out.println("Output: " + sum);

    }

    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
