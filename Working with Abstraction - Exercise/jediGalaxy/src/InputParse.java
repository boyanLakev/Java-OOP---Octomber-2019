import java.util.Arrays;

public class InputParse {
    public static int[] readArray(String input) {
        return Arrays.stream(input.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
