import java.util.*;
public class JP106 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x1 = s.nextInt();
		int y1 = s.nextInt();
		int x2 = s.nextInt();
		int y2 = s.nextInt();
		System.out.printf("%.2f",Math.sqrt(((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1))));
	}
}