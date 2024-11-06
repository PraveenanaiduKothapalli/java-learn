
import java.util.*;

public class Calculator {

    public static void main(String[] args) {
        ArithmeticHelper arithmeticHelper = new ArithmeticHelper();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while (choice != 5) {
            System.out.println("1. Addition \n2. Subtraction \n3. Multiplication \n4. Divison\n5. Exit");
            System.out.print("Enter your Choice : ");
            choice = sc.nextInt();
            int a = 0, b = 0;
            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter number 1 : ");
                a = sc.nextInt();
                System.out.print("Enter number 2 : ");
                b = sc.nextInt();
            }

            switch (choice) {
                case 1:
                    int add = arithmeticHelper.add(a, b);
                    System.out.println("Result : " + add);
                    break;
                case 2:
                    int sub = arithmeticHelper.sub(a, b);
                    System.out.println("Result : " + sub);
                    break;
                case 3:
                    int product = arithmeticHelper.product(a, b);
                    System.out.println("Result : " + product);
                    break;
                case 4:
                    int divide = arithmeticHelper.divide(a, b);
                    System.out.println("Result : " + divide);
                    break;
                case 5:
                    System.out.println("Exitting .....");
                    break;
                default:
                    System.out.println("Please enter correct option");
            }

        }
        sc.close();

    }
}
