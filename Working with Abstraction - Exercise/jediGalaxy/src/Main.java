import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ConsolReader reader = new ConsolReader();
        int[] dimesions = InputParse.readArray(reader.readLine());
        int row = dimesions[0];
        int col = dimesions[1];
        Galaxy galaxy = new Galaxy(new Field(new int[row][col]));

        Enemy enemy=new Enemy(galaxy);
        Player player=new Player(galaxy);
        Engine engine = new Engine(reader,enemy,player );
        engine.run();

        String command = reader.readLine();


        System.out.println(player.getPoint());


    }
}
