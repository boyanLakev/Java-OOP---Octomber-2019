import enums.CardRank;
import enums.CardSuit;
import model.Card;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rank=scanner.nextLine();
        String suit=scanner.nextLine();
        CardRank cardRank= CardRank.valueOf(rank);
        CardSuit cardSuit= CardSuit.valueOf(suit);
        Card card=new Card(cardSuit,cardRank);
        System.out.println(card);
    }
}
