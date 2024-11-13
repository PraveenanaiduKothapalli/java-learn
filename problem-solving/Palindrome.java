import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int size=str.length();
        String strRev="";
        char ch;
        for(int i=size-1;i>=0;i--){
            ch=str.charAt(i);
            strRev=strRev+ch;
        }
        System.out.println(strRev);
        if(str.equals(strRev)){
            System.out.println("Palindrome");  
        }
        else{
            System.out.println("not palindrome");
        }
    }
    
}
