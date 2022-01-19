package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */

        int dp[] = new int[21];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= 20; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        for (int i = 0; i <= 20; i ++) {
            System.out.println("Fibonacci Number for n = " + i + " is " + dp[i]);
        }

    }
}
