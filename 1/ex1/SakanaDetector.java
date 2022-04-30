import java.util.Scanner; // Scannerを使うためのインポート宣言

class SakanaDetector {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        int SAKANA = "魚".codePointAt(0);
        int KAN = "鳤".codePointAt(0);
        for (int i = 0; i < input.length(); i++) {
            if (input.codePointAt(i) >= SAKANA && input.codePointAt(i) <= KAN) {
                System.out.println((i + 1) + "文字目「" + input.charAt(i) + "」は魚がつく文字です！");
            }
        }
        in.close();
    }
}