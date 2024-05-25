import java.util.*;
public class JP202 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int score = s.nextInt();
		if (0>score || score>100) {
			System.out.println("error");
		}else if (score>60) {
			System.out.println(score+10);
		}else if (score<=60) {
			System.out.println(score+5);
		}
	}
}