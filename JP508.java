import java.util.Scanner;

public class JP508 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String b1 = scanner.next();
        String b2 = scanner.next();

        int d1 = Integer.parseInt(b1, 2); //轉變為整數後自動變成10進位
        int d2 = Integer.parseInt(b2, 2);

        int sum = d1 + d2;
        
        System.out.printf("%s + %s = %s\n",d1,d2,sum);
        if (sum < 0 || sum > 255) {
            System.out.println("11111111");
        } else {
            String binarySum = Integer.toBinaryString(sum);
            while (binarySum.length() < 8) {
                binarySum = "0" + binarySum;
            }
            System.out.print(binarySum);
        }
    }
}


