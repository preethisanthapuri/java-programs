import java.util.*;

interface PerformOperation {
    boolean check(int a);
}

public class Solution {

    // Method to check Odd / Even
    public static PerformOperation isOdd() {
        return (int a) -> a % 2 != 0;
    }

    // Method to check Prime / Composite
    public static PerformOperation isPrime() {
        return (int a) -> {
            if (a <= 1) return false;
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0)
                    return false;
            }
            return true;
        };
    }

    // Method to check Palindrome
    public static PerformOperation isPalindrome() {
        return (int a) -> {
            int original = a, rev = 0;
            while (a > 0) {
                rev = rev * 10 + (a % 10);
                a /= 10;
            }
            return original == rev;
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int choice = sc.nextInt();
            int num = sc.nextInt();

            PerformOperation op;
            boolean result;

            if (choice == 1) {
                op = isOdd();
                result = op.check(num);
                System.out.println(result ? "ODD" : "EVEN");

            } else if (choice == 2) {
                op = isPrime();
                result = op.check(num);
                System.out.println(result ? "PRIME" : "COMPOSITE");

            } else if (choice == 3) {
                op = isPalindrome();
                result = op.check(num);
                System.out.println(result ? "PALINDROME" : "NOT PALINDROME");
            }
        }
        sc.close();
    }
}
