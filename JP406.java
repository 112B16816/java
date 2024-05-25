import java.util.*;
public class JP406 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String k = "qwertyuioppasdfghjkllzxcvbnmmQWERTYUIOPPASDFGHJKLLZXCVBNMM"; //鍵盤順序
        String input = s.nextLine();  //使用者輸入字串
        String L[] = input.split("");  //將使用者輸入字串分解成字元後加進L串列
        for(int i = 0;i<input.length();i++){  //遍歷每個字元
            System.out.print(k.charAt((k.indexOf(L[i])) + 1));  //輸出每個字元右邊的字元
        }
    }
}