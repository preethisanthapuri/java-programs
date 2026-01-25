import java.util.*;
import java.io.*;

interface PerformOperation {
    boolean check(int a);
}

public class Solution {

    // Method to check Odd / Even
    static PerformOperation isOdd() {
        return (int a) -> a % 2 != 0;
    }

    // Method to check Prime / Composite
    static PerformOperation isPrime() {
        return (int a) -> {
            if (a <= 1) return false;
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) return false;
            }
            return true;
        };
    }

    // Method to check Palindrome
    static PerformOperation isPalindrome() {
        return (int a) -> {
            int original = a;
            int reverse = 0;

            while (a > 0) {
                reverse = reverse * 10 + a % 10;
                a /= 10;
            }
            return original == reverse;
        };
    }

    // Helper method used by stub code
    static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int choice = sc.nextInt();
            int num = sc.nextInt();

            PerformOperation op;
            boolean result;

            if (choice == 1) {
                op = isOdd();
                result = checker(op, num);
                System.out.println(result ? "ODD" : "EVEN");

            } else if (choice == 2) {
                op = isPrime();
                result = checker(op, num);
                System.out.println(result ? "PRIME" : "COMPOSITE");

            } else if (choice == 3) {
                op = isPalindrome();
                result = checker(op, num);
                System.out.println(result ? "PALINDROME" : "NOT PALINDROME");
            }
        }
        sc.close();
    }
}
