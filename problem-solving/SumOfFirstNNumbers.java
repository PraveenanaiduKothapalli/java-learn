import java.util.*;
public class SumOfFirstNNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Sum of numbers : ");
        int n=sc.nextInt();
        int sum=(n*(n+1))/2;
        System.out.println(sum);
    }
}
