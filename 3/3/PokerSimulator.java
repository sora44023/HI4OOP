import java.util.*;

class PokerSimulator{
    public static void main(String[] args){
        Card[] c = new Card[52];
        ArrayList<Integer> num = new ArrayList<Integer>();
        for (int i=0;i<52;i++){
            c[i] = new Card(i/13, i%13+1);
            num.add(i);
        }

        for(int i=0;i<10;i++){
            Collections.shuffle(num);
            System.out.println(""+c[num.get(0)]+" - "+c[num.get(1)]+" - "+c[num.get(2)]);
            System.out.println("<< "+c[num.get(0)].hand(c[num.get(1)],c[num.get(2)])+" >>\n");
        }
        System.out.println();
        System.out.println("---------役が判定できるか確認用---------\n");
        Card c1 = new Card(Card.SUIT_SPADE, 4);
        Card c2 = new Card(Card.SUIT_HEART, 4);
        Card c3 = new Card(Card.SUIT_CLUB, 4);
        Card c4 = new Card(Card.SUIT_CLUB, 5);
        Card c5 = new Card(Card.SUIT_CLUB, 6);
        Card c6 = new Card(Card.SUIT_SPADE, 6);
        System.out.println(""+c1+" - "+c2+" - "+c3);
        System.out.println("<< "+c1.hand(c2,c3)+" >>\n");
        System.out.println(""+c3+" - "+c4+" - "+c5);
        System.out.println("<< "+c3.hand(c4,c5)+" >>\n");
        System.out.println(""+c4+" - "+c5+" - "+c6);
        System.out.println("<< "+c4.hand(c5,c6)+" >>\n");
        System.out.println(""+c1+" - "+c2+" - "+c4);
        System.out.println("<< "+c1.hand(c2,c4)+" >>\n");
    }
}