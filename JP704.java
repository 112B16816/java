import java.util.*;
public class JP704 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n <= 1 || n > 15) {
            System.out.println("error");
            return;
        }
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        int majorityCount = n / 2 + 1;
        HashMap<Integer, Integer> countMap = new HashMap<>();
        // 計算每個數字出現的次數
        for (int num : numbers) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            if (countMap.get(num) >= majorityCount) {
                System.out.println(num);
                return;
            }
        }
        System.out.println("error");
        scanner.close();
    }
}