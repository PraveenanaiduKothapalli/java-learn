import java.util.*;
public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
        int factors=0;
        if(n<2){
            System.out.println(n+" is not prime");
        }
        for(int i=1;i<=n;i++){
            if(n%i==0){
                factors=factors+1;
            }
        }
        if(factors==2){
            System.out.println("The given number "+n+" is a prime number. ");
        }
        else{
            System.out.println("not prime");
        }
    }
}
