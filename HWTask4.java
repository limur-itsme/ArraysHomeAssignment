public class HWTask4 {
    public static void main(String[] args) {
        int[] numbers = {4, 7, 2, 4, 9, 7, 1, 2, 8, 4};

        System.out.print("Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        boolean hasDuplicates = false;

        for (int i = 0; i < numbers.length; i++) {
            boolean alreadyChecked = false;
            for (int k = 0; k < i; k++) {
                if (numbers[k] == numbers[i]) {
                    alreadyChecked = true;
                    break;
                }
            }
            if (alreadyChecked) {
                continue;
            }

            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    if (!hasDuplicates) {
                        System.out.print("Duplicate numbers: ");
                        hasDuplicates = true;
                    }
                    System.out.print(numbers[i] + " ");
                    break;
                }
            }
        }

        if (!hasDuplicates) {
            System.out.println("No duplicate numbers found.");
        }
    }
}