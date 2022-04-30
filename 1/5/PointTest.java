// (1) complete
// (2) complete
// (3) complete
import java.util.Scanner; // Scannerを使うためのインポート宣言
import java.util.InputMismatchException;

class PointTest {
    public static void main(String[] args) {
        boolean out = true; // 描画時に数字（またはX）を出力した場合は . を出力しない

        int element = 10;
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("点をいくつ生成しますか?（標準は10です）: ");
            element = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("エラーが発生したので，終了します．\nエラー内容: " + e);
            System.exit(0);
        }
        if (element < 0 || element > 10001) {
            System.out.println("エラーが発生したので，終了します．\nエラー内容: 範囲外の数値の入力");
            System.exit(0);
        }
        System.out.println(element+"x"+element+"の2次元グラフを生成します．"); 

        boolean xcheck[] = new boolean[element]; // 乱数生成時に重複を防ぐチェック用（次の行も同じ）
        boolean ycheck[] = new boolean[element];

        // (1)
        // false埋め
        for (int i = 0; i < element; i++) {
            xcheck[i] = false;
            ycheck[i] = false;
        }

        // インスタンス生成
        Point[] p = new Point[element];
        for (int i = 0; i < element; i++) {
            int x, y;
            while (true) {
                x = (int) (Math.random() * element);
                if (xcheck[x] == false) {
                    xcheck[x] = true;
                    break;
                }
            }
            while (true) {
                y = (int) (Math.random() * element);
                if (ycheck[y] == false) {
                    ycheck[y] = true;
                    break;
                }
            }
            p[i] = new Point(x, y);
        }

        // (3)
        double xDist = 0;
        double minDist = 500;
        Point temp = new Point();
        Point xPoint = new Point();
        for (int i = 0; i < element; i++) {
            for (int j = 0; j < element; j++) {
                xDist = 0;
                temp.set(i, j);
                for (int k = 0; k < element; k++) {
                    xDist += temp.getDistance(p[k]);
                }
                if (minDist > (xDist / element)) {
                    minDist = xDist / element;
                    xPoint.set(i, j);
                }
            }
        }
        // (3)終わり

        // (1)
        // 描画
        if (element <= 10) {
            for (int i = 0; i < element; i++) {
                for (int j = 0; j < element; j++) {
                    if (j == xPoint.x && i == xPoint.y) {
                        System.out.print("X");
                        out = false;
                    } else {
                        for (int k = 0; k < element; k++) {
                            if (j == p[k].x && i == p[k].y) {
                                System.out.print(k);
                                out = false;
                            }
                        }
                    }

                    if (out) {
                        System.out.print(".");
                    }
                    out = true;
                    System.out.print(" ");
                }
                System.out.println("");
            }
        }

        System.out.println("各点への距離の平均が最も小さくなるXの座標 (" + xPoint.x +","+ xPoint.y + ")"); // (3)表示用

        // (2)
        int num = 0;
        try {
            System.out.print("どの点について調べますか?: ");
            num = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("エラーが発生したので，終了します．\nエラー内容: " + e);
            System.exit(0);
        }
        if (num < 0 || num >= element) {
            System.out.println("エラーが発生したので，終了します．\nエラー内容: 範囲外の数値の入力");
            System.exit(0);
        }
        in.close();
        int min = 0;
        int max = 0;
        if (num == 0) {
            min++;
            max++;
        }
        double minD = p[num].getDistance(p[min]);
        double maxD = p[num].getDistance(p[max]);
        for (int i = 1; i < element; i++) {
            if (minD > p[num].getDistance(p[i]) && num != i) {
                minD = p[num].getDistance(p[i]);
                min = i;
            }
            if (maxD < p[num].getDistance(p[i])) {
                maxD = p[num].getDistance(p[i]);
                max = i;
            }
        }
        System.out.println("最も近い点は点" + min + "(距離 " + p[num].getDistance(p[min]) + ")");
        System.out.println("最も遠い点は点" + max + "(距離 " + p[num].getDistance(p[max]) + ")");
    }
}
