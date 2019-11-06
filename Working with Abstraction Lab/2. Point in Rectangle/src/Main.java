import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] coordinat= arrRead(reader);
        Poin bootomLeft=new Poin(coordinat[0],coordinat[1]);
        Poin topRight=new Poin(coordinat[2],coordinat[3]);
        Restagle restagle=new Restagle(bootomLeft,topRight);
        int n=Integer.parseInt(reader.readLine());
        for (int i = 0; i <n ; i++) {
            int[] curent= arrRead(reader);
            Poin currentPoin=new Poin(curent[0],curent[1]);
            System.out.println(restagle.contains(currentPoin));
        }

    }

    private static int[] arrRead(BufferedReader reader) throws IOException {
        return Arrays.stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
    }
}
