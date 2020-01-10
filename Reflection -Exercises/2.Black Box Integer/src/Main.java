import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;
@SuppressWarnings("All")

public class Main {
    public static void main(String[] args) throws NoSuchFieldException {
        Scanner scanner = new Scanner(System.in);
        BlackBoxInt blackBoxInt = null;
        Field innerValue=BlackBoxInt.class.getDeclaredField("innerValue");
        innerValue.setAccessible(true);

        try {
            Constructor constructor = BlackBoxInt.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            blackBoxInt = (BlackBoxInt) constructor.newInstance();
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        String input = scanner.nextLine();
        Method[] methods = BlackBoxInt.class.getDeclaredMethods();

        while (!input.equals("END")) {
            String command = input.substring(0, input.indexOf("_"));
            int value = Integer.parseInt(input.substring(input.indexOf("_") + 1));

            Method method = Arrays.stream(methods)
                    .filter(e -> e.getName().equals(command))
                    .findFirst()
                    .orElse(null);
            method.setAccessible(true);
            try {
                method.invoke(blackBoxInt, value);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }

            try {
                System.out.println(innerValue.getInt(blackBoxInt));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }


            input = scanner.nextLine();
        }
    }
}
