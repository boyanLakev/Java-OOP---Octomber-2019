import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RhombusOfStars {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(reader.readLine());
        for (int i = 1; i <=n ; i++) {
            printCurrentRow(n, i);
        }
        for (int i = n-1; i >0 ; i--) {
            printCurrentRow(n, i);
        }
    }

    private static void printCurrentRow(int n, int i) {
        printSpase(n, i);
        printMultiplaySymbol(i);
        System.out.println();
    }

    private static void printMultiplaySymbol(int i) {
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }
    }

    private static void printSpase(int n, int i) {
        for (int j = n - 1; j >= i; j--) {
            System.out.print(" ");
        }
    }
}
