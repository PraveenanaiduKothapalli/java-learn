import java.util.*;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int size=s.length();
        //abc
        String ns="";
        char ch=0;
        for(int i=size-1;i>=0;i--){
            ch=s.charAt(i);
            ns=ns+ch;
        }
        System.out.println(ns);
        if(s.equals(ns)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
    
}
