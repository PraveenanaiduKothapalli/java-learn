
import java.util.*;

public class SumOfOddNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        System.out.println("Enter the array elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i < n; i++) {

            if (arr[i] % 2 != 0) {
                sum = sum + arr[i];
            }
        }
        System.out.println(sum);

    }
}
