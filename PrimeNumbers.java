public class PrimeNumbers {
    public static void main(String[] args) {
        int limit = 50;

        System.out.println("Prime numbers from 1 to " + limit + " are:");

        for (int number = 2; number <= limit; number++) {
            boolean isPrime = true;
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(number + " ");
            }
        }
    }
}
