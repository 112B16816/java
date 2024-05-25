import java.util.Scanner;

public class JP606 {
    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);
        String[] input = new String[3];
        for (int i = 0; i < 3; i++) {
            input[i] = s.nextLine();
        }
        run(input);
    }
    public static void run(String[] input) {
        for (String in : input) {
            
            String[] inList = in.split("");
            
            int sum = ((Integer.parseInt(inList[0]) +
                 Integer.parseInt(inList[2]) + 
                Integer.parseInt(inList[4])) + 
                (Integer.parseInt(inList[1]) + Integer.parseInt(inList[3])) * 5) % 26;  //s5的判斷規則
            if (((char) (sum + 'A' - 1)) == in.charAt(5)) {
                System.out.println("Pass");
            } else {
                System.out.println("Fail");
            }
        }
    }
}