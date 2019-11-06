import enums.CardRank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        System.out.println("Card Ranks:");
        for (CardRank suit : CardRank.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",suit.ordinal(),suit);
        }

    }

}
