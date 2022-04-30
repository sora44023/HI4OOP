import java.io.*;
import java.util.*;

class WordGame {
    private static QuizSet makeQuizSet(String CSVFileName, int n, Random rand) {
        boolean RandomMode = false;
        String[] name = CSVFileName.split("\\.");
        QuizSet qset = new QuizSet(name[0]);
        if (n == 3)
            RandomMode = true;
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(CSVFileName)));
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(",");
                if (RandomMode)
                    n = rand.nextInt(3);
                if (n == 0)
                    qset.add(new Quiz(new Entry(tokens[0], tokens[1])));
                else if (n == 1)
                    qset.add(
                            new MushikuiQuiz(new Entry(tokens[0], tokens[1]), rand.nextInt(2) + 2));
                else if (n == 2)
                    qset.add(new AnagramQuiz(new Entry(tokens[0], tokens[1])));
            }
            br.close();
        } catch (IOException e) {
            System.out.println("IOException.");
        }
        return qset;
    }

    private static int inputNumber(int s, int f) {
        int n = 0;
        String str;
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print(" > ");
            try {
                str = in.next();
                n = Integer.parseInt(str);
            } catch (NumberFormatException e) {
                System.out.println("Warning:正しい引数を入力してください．");
                continue;
            }
            if (n < s || n > f) {
                System.out.println(String.format("Warning:%d-%dの値を指定してください．", s, f));
                continue;
            }
            break;
        }
        return n;
    }

    private static void timeSleep(int time) {
        try {
            Thread.sleep(time);
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int correct = 0; // 正解数
        String[] colors = new String[] {"\u001b[00;31m", "\u001b[00;32m", "\u001b[00;33m",
                "\u001b[00;36m", "\u001b[00m"}; // カウントダウンの文字で使用する色
        // CSVファイルの選択 <ここから>
        ArrayList<String> fl = new ArrayList<String>();
        File dir = new File("."); // ディレクトリ内のファイル
        String[] dirlist = dir.list();
        for (int i = 0; i < dirlist.length; i++) {
            String[] tmp = dirlist[i].split("\\.");
            if (tmp.length == 2 && tmp[1].equals("csv"))
                fl.add(tmp[0]);
        }
        if (fl.size() == 0) {
            System.out.println("CSVファイルがこのディレクトリに存在しません．終了します．");
            System.exit(0);
        }
        System.out.println("出題する英単語の種類を数字で選択してください．");
        for (int i = 0; i < fl.size(); i++)
            System.out.println(String.format(" %d : %s", i, fl.get(i)));
        System.out.println(String.format(" %d : %s", fl.size(), "random"));
        int fl_num = inputNumber(0, fl.size());
        if (fl_num == fl.size())
            fl_num = rand.nextInt(fl.size());

        System.out.println();
        // CSVファイルの選択 <ここまで>

        // ゲームモードの選択 <ここから>
        String[][] mode = {{"Normal mode", "★★★"}, {"Mushikui mode", "★☆☆"},
                {"Anagram mode", "★☆☆"}, {"Random mode", "★★☆"}};
        System.out.println("ゲームモードを数字で選択してください（★の数が多いほど難易度UP）．");
        for (int i = 0; i < mode.length; i++)
            System.out.println(String.format(" %d : %s\t%s", i, mode[i][0], mode[i][1]));
        int n = inputNumber(0, 3);
        // ゲームモードの選択 <ここまで>

        QuizSet qset = makeQuizSet(fl.get(fl_num) + ".csv", n, rand); // CSVファイル名とゲームモードの番号，乱数ジェネレータを引数に与えてQuizSetを作成
        qset.shuffle();
        System.out.println("\n英単語ゲーム開始まで...");
        for (int i = 3; i > 0; i--) {
            System.out.println(colors[3 - i] + i + colors[4]);
            timeSleep(1000);
        }
        System.out.println("START!");
        long start = System.currentTimeMillis();
        for (int i = 0; i < qset.getSize(); i++) {
            System.out.println(String.format("[第 %d/%d 問]", i + 1, qset.getSize()));
            qset.getQuiz().show();
            System.out.print("\n答えを入力 > ");
            boolean isCorrect = qset.getQuiz().ask();
            String answer = qset.getNextQuiz().getEntry().getWord();

            timeSleep(100);
            if (isCorrect) {
                System.out.println(colors[0]
                        + "\n◆◇◆◇◆◇◆◇◆◇\n＼＼＼｜｜｜｜／／／\n★☆    正解    ☆★\n／／／｜｜｜｜＼＼＼\n◆◇◆◇◆◇◆◇◆◇"
                        + colors[4]);
                correct++;
            } else {
                System.out
                        .println(colors[3] + "\n◤◢◤◢◤◢◤◢◤◢\n  残念，不正解...  \n◤◢◤◢◤◢◤◢◤◢" + colors[4]);
                System.out.println(String.format("\n正解は「%s」です", answer));
            }
            timeSleep(700);
            System.out.println();
        }
        long end = System.currentTimeMillis();
        System.out.println((end - start) / 1000);
        System.out.println(colors[2] + String.format(
                "┏━━━━━━━ 結果 ━━━━━━━┓\n 正解数: %d 問中 %d 問\n 正解率: %.1f %%\n 解答時間: %.2f 秒\n┗━━━━━━━━━━━━━━━━━━━━┛",
                correct, qset.getSize(), (double) correct / qset.getSize() * 100,
                (double) (end - start) / 1000) + colors[4]);
    }
}
