import java.util.Arrays;
import java.util.Scanner;

public class KthSmallest {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter K: ");
        int k = sc.nextInt();

        Arrays.sort(arr);

        System.out.println("Kth smallest element: " + arr[k - 1]);
    }
}
