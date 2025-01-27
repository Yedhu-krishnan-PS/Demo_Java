public class class005 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};

        // Fetching individual numbers
        System.out.println(numbers[0]);  // Output: 1
        System.out.println(numbers[5]);  // Output: 5

        // Fetching multiple numbers
        int firstAndLast = numbers[0] + numbers[numbers.length - 1];
        System.out.println("Sum of first and last number: " + firstAndLast);

        // Fetching numbers using loops
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }
}
