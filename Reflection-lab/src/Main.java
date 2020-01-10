public class Main {
    public static void main(String[] args) {
        Reflection reflection = new Reflection();
        Class  clazz = Reflection.class;
        System.out.println(clazz);
        System.out.println(clazz.getSuperclass());

        clazz.getName();
        clazz.getSimpleName();


    }

}
