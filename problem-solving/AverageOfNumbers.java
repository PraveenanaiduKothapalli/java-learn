
import java.util.*;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the count of numbers : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Numbers entered by user : ");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        int average = sum / n;
        System.out.println("Average of numbers entered by user : " + average);

    }
}
