import java.util.Scanner;
public class JP308{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        for (int i = a;i>=1;i--){
            int Ans = compute(i);
            System.out.printf("fib(%d)=%d\n",i,Ans);
        }
        s.close();
    }
    public static int compute(int n){
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        else{
            return compute(n-1)+compute(n-2);
        }
    }
}
//Fn = Fn-1 + Fn-2  F0 = 0 F1 = 1
//n == 2
//F2 = F2-1 + F2-2
//F2 = F1 + F0