import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1_SquareRoot {
    public static void main(String[] args) {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        try{
            int number=Integer.parseInt(reader.readLine());


        }catch (NumberFormatException ex){
            System.out.println("Invalid number");
        } catch (IOException ignored) {

        } finally {
            System.out.println("Good bye");
        }

    }
}
