import java.util.*;
public class JP306 {
    public static int compute(int n) {
        int total = 1;
        for(int i = 1;i<=n;i++) {
            total = total*i;
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int result = compute(n);
        System.out.print(n+"!="+result);
    }
}