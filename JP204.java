import java.util.*;
public class JP204 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		char c = s.next().charAt(0);
		if (c=='+') {
			System.out.printf("%d-%d=%d",a,b,a+b);
		}else if (c=='-') {
			System.out.printf("%d-%d=%d",a,b,a-b);
		}else if (c=='*') {
			System.out.printf("%d*%d=%d",a,b,a*b);
		}else{
			System.out.println("error");
		}
	}
}