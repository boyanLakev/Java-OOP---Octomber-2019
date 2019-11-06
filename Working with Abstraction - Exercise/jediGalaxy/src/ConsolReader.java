import java.util.Arrays;
import java.util.Scanner;

public class ConsolReader {
    private Scanner scanner;

    public ConsolReader(){
        this.scanner=new Scanner(System.in);

    }


    public String readLine(){
        return scanner.nextLine();
    }
}
