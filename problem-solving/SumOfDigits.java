import java.util.*;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int remainder=0,sum=0;
        while (n > 0) { 
            remainder=n%10;
            sum=sum+remainder;
            n=n/10;
        }
        System.out.println("sum : "+sum);
        

    }
}
