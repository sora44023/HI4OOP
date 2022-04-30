class CoinWalletTest{
    public static void main(String[] args){
        CoinWallet cw1 = new CoinWallet(2,3);
        System.out.println(cw1.sum()); // 「230」
        cw1.show(); // 「230Yen (100:2, 10:3)」
        CoinWallet cw2 = new CoinWallet(1, 5);
        System.out.println(cw2.hasMoreMoneyThan(cw1)); //「false」
        cw2.transferTo(cw1);
        cw1.show();
        cw2.show();

        // cw1.coin100 = 2; // コンパイルできない
        // System.out.println(cw1.coin10); // コンパイルできない
    }
}