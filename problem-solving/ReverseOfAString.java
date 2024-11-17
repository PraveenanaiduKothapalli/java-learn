import java.util.*;
public class ReverseOfAString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine(); 
        String ns="";
        int size=s.length();
        char ch;
        //praveena 
        //aneevarp
        //abc-->0,1,2
        //cba-->2,1,0
        for(int i=size-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
        for(int i=size-1;i>=0;i--){
            ch=s.charAt(i);
            ns=ns+ch;
        }
        System.out.println(ns);
    }
    
}
