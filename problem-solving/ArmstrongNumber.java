import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num1=n;
        int remainder=0,cube=0,sum=0;
        //123
        while(n>0){
            remainder=n%10;
            cube=remainder*remainder*remainder;
            sum=sum+cube;
            n=n/10;
        }
        System.out.println(sum);
        if(num1==sum){
            System.out.println(num1+" is armstrong number.");
        }
        else{
            System.out.println(num1+" is not an armstrong number.");
        }
        
    }
}
