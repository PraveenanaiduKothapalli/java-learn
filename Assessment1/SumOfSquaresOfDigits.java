import java.util.*;
public class SumOfSquaresOfDigits{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int remainder=0,sum=0,square=0;
        while(n>0){
            remainder=n%10;
            square=remainder*remainder;
            sum=sum+square;
            n=n/10;
        }
        System.out.println(sum);

    }
}