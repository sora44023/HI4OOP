class CardTest{
    public static void main(String[] args){
        System.out.println(new Card());
        System.out.println(new Card());
        System.out.println(new Card());
        System.out.println(new Card());
        System.out.println(new Card());
        System.out.println();

        Card c1 = new Card(Card.SUIT_SPADE, 4);
        Card c2 = new Card(Card.SUIT_SPADE, 6);
        Card c3 = new Card(Card.SUIT_CLUB, 4);
        Card c4 = new Card(Card.SUIT_HEART, 12);
        Card c5 = new Card(Card.SUIT_HEART, 12);
        System.out.println();

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println();

        System.out.println(""+c1+" is stronger than "+c2+"?: "+c1.isStrongerThan(c2));
        System.out.println(""+c1+" is stronger than "+c3+"?: "+c1.isStrongerThan(c3));
        System.out.println(""+c4+" is stronger than "+c5+"?: "+c4.isStrongerThan(c5));
        System.out.println(""+c1+" is same as "+c2+"?: "+c1.isSameAs(c2));
        System.out.println(""+c1+" is same as "+c3+"?: "+c1.isSameAs(c3));
        System.out.println(""+c1+" is same as "+c4+"?: "+c1.isSameAs(c4));
        System.out.println(""+c4+" is same as "+c5+"?: "+c4.isSameAs(c5));

    }
}
