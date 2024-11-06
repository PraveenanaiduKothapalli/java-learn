import java.util.*;
// public class Calculator {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter your Choice : ");
//         int n=sc.nextInt();
//         System.out.print("Enter number 1 : ");
//         int num1=sc.nextInt();
//         System.out.print("Enter number 2 : ");
//         int num2=sc.nextInt();
//         switch(n){
            
//             case 1:
//             int sum=num1+num2;
//             System.out.println("Result : "+sum);
//             break;
//             case 2:
//             int subtract=num1-num2;
//             System.out.println("Result : "+subtract);
//             break;
//             case 3:
//             int product=num1*num2;
//             System.out.println("Result : "+product);
//             break;
//             case 4:
//             int division=num1/num2;
//             System.out.println("Result : "+division);
//             break;
//             case 5:
//             System.out.println("Exitting .....");
//             break;
//             default:
//             System.out.println("Please enter correct option");
//         }
//     }
// }
public class Calculator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your choice : ");
        int n=sc.nextInt();
        if(n==1){
            System.out.print("Enter number 1 : ");
            int num1=sc.nextInt();
            System.out.print("Enter number 2 : ");
            int num2=sc.nextInt();
            int sum=num1+num2;
            System.out.println("Result : "+sum);
        }
        if(n==2){
            System.out.print("Enter number 1 : ");
            int num1=sc.nextInt();
            System.out.print("Enter number 2 : ");
            int num2=sc.nextInt();
            int subtract=num1-num2;
            System.out.println("Result : "+subtract);
        }
        if(n==3){
            System.out.print("Enter number 1 : ");
            int num1=sc.nextInt();
            System.out.print("Enter number 2 : ");
            int num2=sc.nextInt();
            int product=num1*num2;
            System.out.println("Result : "+product);
        }
        if(n==4){
            System.out.print("Enter number 1 : ");
            int num1=sc.nextInt();
            System.out.print("Enter number 2 : ");
            int num2=sc.nextInt();
            int division=num1/num2;
            System.out.println("Result : "+division);
        }
        if(n==5){
            System.out.print("Exitting.....");
        }
        if(n==6){
            System.out.print("Please enter correct answer");
        }
    }
}
