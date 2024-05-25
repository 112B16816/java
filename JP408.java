import java.util.*;
public class JP408 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String s2 = s.nextLine();
        StringBuilder reversed1 = new StringBuilder(s1).reverse();
        String r1 = reversed1.toString();
        StringBuilder reversed2 = new StringBuilder(s2).reverse();
        String r2 = reversed2.toString();

        if (s1.length()<3||s1.length()>20||s2.length()<3||s2.length()>20) {
            System.out.println("error");
        }else{
            System.out.println(s1.length());
            System.out.println(s2.length());
            System.out.println(r2+r1);
        }
    }
}