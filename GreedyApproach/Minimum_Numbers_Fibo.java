public class Minimum_Numbers_Fibo{
    public static void main(String[] args) {
        int n = 10; // Example input
        System.out.println("Minimum numbers required to sum to " + n + ": " + minFiboNumbers(n));
    }

    // Function to find the minimum number of Fibonacci numbers that sum to n
    public static int minFiboNumbers(int n) {   
        if (n <= 0) return 0;

        // Generate Fibonacci numbers up to n
        int[] fib = new int[n + 1];
        fib[0] = 0;
        fib[1] = 1;
        int count = 2;

        while (true) {
            int nextFib = fib[count - 1] + fib[count - 2];
            if (nextFib > n) break;
            fib[count++] = nextFib;
        }

        // Greedily find the minimum number of Fibonacci numbers
        int result = 0;
        for (int i = count - 1; i >= 0 && n > 0; i--) {
            while (n >= fib[i]) {
                n -= fib[i];
                result++;
            }
        }
        
        return result;
    }
}