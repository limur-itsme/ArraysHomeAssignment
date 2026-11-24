import java.util.Scanner;

public class HWTask3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.print("Original: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Enter index to remove: ");
        int index = scanner.nextInt();

        if (index < 0 || index >= numbers.length) {
            System.out.println("Invalid index");
            return;
        }

        for (int i = index; i < numbers.length - 1; i++) {
            numbers[i] = numbers[i + 1];
        }

        System.out.print("Updated: ");
        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}