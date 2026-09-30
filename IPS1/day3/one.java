public class one {
    

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 0 and 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // found a divisor
            }
        }
        return true; // no divisors found, so it's prime
    }

    public static void main(String[] args) {
        System.out.println(isPrime(3));   // true
        System.out.println(isPrime(4));   // false
        System.out.println(isPrime(13));  // true
        System.out.println(isPrime(25));  // false
    }
}


