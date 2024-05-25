import java.util.*;
public class JP206 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int total = 0;
        for(int i = a ; i<=b;i++) {
            if (i%2!=0) {
                total = total + i;
            }
        }
        System.out.println(total);
    }
}