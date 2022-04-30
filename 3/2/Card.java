class Card{
    // スートを示す定数値．「Card.SUIT_SPADE」といった表現で取得できる．
    public static final int SUIT_SPADE = 0;
    public static final int SUIT_HEART = 1;
    public static final int SUIT_DIAMOND = 2;
    public static final int SUIT_CLUB = 3;

    private int suit;   //カードの「スート」を示す整数のフィールド．
    private int number; //カードの「強さの値」を示す整数のフィールド

    Card(){
        suit = (int) (Math.random() * 4);       //0~3のランダムな値を生成
        number = (int) (Math.random() * 13)+1;  //1~13のランダムな値を生成
    }

    Card(int suit, int number){
        this.suit = suit;
        this.number = number;
    }

    boolean isStrongerThan(Card c){
        if(number>c.number){
            return true;
        }else if(number<c.number){
            return false;
        }else if(suit<c.suit){
            return true;
        }else{
            return false;
        }
    }

    boolean isSameAs(Card c){
        if(suit==c.suit && number==c.number){
            return true;
        }else{
            return false;
        }
    }

    private String getTrumpDisplay(){
        if(number==1){
            return "A";
        }else if(number==11){
            return "J";
        }else if(number==12){
            return "Q";
        }else if(number==13){
            return "K";
        }else{
            return String.valueOf(number);
        }
    }

    private String getSuitString(){
        switch(suit){
            case SUIT_SPADE:
                return "SPADE";
            case SUIT_HEART:
                return "HEART";
            case SUIT_DIAMOND:
                return "DIAMOND";
            default:
                return "CLUB";
        }
    }
    @Override
    public String toString(){
        return "" + String.format("%-7s",getSuitString()) + "[" + String.format("%2s",getTrumpDisplay()) + "]";
    }
}