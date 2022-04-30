import java.util.*;

class PokerGame {
    public static void main(String[] args) {
        int money = 100000; // ゲーム開始時の所持金
        int bet = 0; // 賭けるお金
        String player, cpu;
        // トランプの準備
        Card[] c = new Card[52];
        ArrayList<Integer> num = new ArrayList<Integer>();
        for (int i = 0; i < 52; i++) {
            c[i] = new Card(i / 13, i % 13 + 1);
            num.add(i);
        }

        // ゲームの内容
        System.out.println("Welcome to PokerGame");
        System.out.println("あなたの所持金は " + money + " 円です．\n");
        while (true) {
            Collections.shuffle(num); // 0~52の数字をシャッフル

            Scanner in = new Scanner(System.in);
            while (true) {
                if (money <= 0) {
                    System.out.println("所持金が0円となったのであなたの負けです．ゲームを終了します．");
                    break;
                }
                try {
                    System.out.print("賭ける金額を入力してください: ");
                    String x = in.next();
                    bet = Integer.parseInt(x);
                    if (bet >= 0 && bet <= money) {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("" + money + " 円以内の金額を整数値で入力してください．");
                }
            }

            System.out.println("\nあなたのカードを表示します．\n---------------------------------------");
            System.out.println("" + c[num.get(0)] + " - " + c[num.get(1)] + " - " + c[num.get(2)]);
            player = c[num.get(0)].hand(c[num.get(1)], c[num.get(2)]);
            System.out.println("<< " + player + " >>" + "\n---------------------------------------\n");
            System.out.print("プレイを続行しますか？\n続行する場合は q以外の何かしらのキー を，降りる場合は q を入力してください: ");
            String key = in.next();
            if (key.equals("q")) {
                money -= bet;
                System.out.println("あなたの所持金は " + money + " 円になりました．");
                continue;
            }
            System.out.print("\nCPUのカードを表示します．\n---------------------------------------");
            System.out.println("\n" + c[num.get(3)] + " - " + c[num.get(4)] + " - " + c[num.get(5)]);
            cpu = c[num.get(3)].hand(c[num.get(4)], c[num.get(5)]);
            System.out.println("<< " + cpu + " >>" + "\n---------------------------------------\n");

            System.out.println();

            int dividend = 0; // 配当金
            if (handNum(player) > handNum(cpu)) {
                dividend = calDividend(bet, handNum(player), '+');
            } else if (handNum(player) < handNum(cpu)) {
                dividend = calDividend(bet, handNum(cpu), '-');
            } else {
                Card playerCard = c[num.get(0)].isStrongestCard(c[num.get(1)], c[num.get(2)]);
                Card cpuCard = c[num.get(3)].isStrongestCard(c[num.get(4)], c[num.get(5)]);
                if (playerCard.isStrongerThan(cpuCard)) {
                    dividend = 0;
                } else {
                    dividend -= bet;
                }
            }
            System.out.println("配当金は " + dividend + " 円です．");
            money += dividend;
            System.out.println("あなたの所持金は " + money + " 円になりました．");
            System.out.print("ゲームを続行しますか？\n続ける場合は q以外の何かしらのキー を，終了する場合は q を入力してください: ");
            key = in.next();
            if (key.equals("q")) {
                break;
            }
        }
    }

    static int handNum(String s) {
        int i = 0;
        if (s.equals("Three of a kind!!!")) {
            i = 30;
        } else if (s.equals("Flush!!")) {
            i = 4;
        } else if (s.equals("One pair")) {
            i = 1;
        }
        return i;
    }

    static int calDividend(int bet, int n, char c) {
        if (c == '+') {
            return bet * n;
        } else {
            return -bet * n;
        }
    }
}