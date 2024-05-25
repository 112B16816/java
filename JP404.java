import java.util.Scanner;
public class JP404 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] letters = input.split("");
        // 宣告一個陣列來存放每個英文字母出現的次數
        int[] count = new int[26]; //長度26的串列，存放各個英文字母出現的次數
        // 遍歷每個字元，計算每個字母出現的次數
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {  //檢查ASCII的a~z
                count[ch - 'a']++;  //陣列0~25對應a~z
            }
        }
        int maxCount = 0;
        char maxChar = ' ';
        for (int i = 0; i < 26; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                maxChar = (char) ('a' + i);
            }
        }
        System.out.println(maxChar);
        System.out.println(maxCount);
        scanner.close();
    }
}
