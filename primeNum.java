public class primeNum {

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int count = 0;

        for (int number = 2; count < 100; number++) {
            if (isPrime(number)) {
                // System.out.println(number);

                // check any prime number divisible by 2
                if (number % 2 == 0) {
                    System.out.println(number);
                }
                count++;
            }
        }
    }
}