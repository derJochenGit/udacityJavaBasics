package lesson7;
import java.util.ArrayList;

public class GenericsExcercise {

    public static void main(String[] args) {
        ArrayList<Object> variables = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();
        Double doubleNumber = 1.5;
        String name = "Sally";
        int intNumber = 1;
        char letter = 'a';

        variables.add(doubleNumber);
        variables.add(name);
        variables.add(intNumber);
        variables.add(letter);

        for (Object variable : variables) {
            GenericsExcercise.displayClassName(variable);
        }

    }
    public static <T> void displayClassName(T variable) {
        System.out.println(variable.getClass());
    }

    public static void sayHello(String name) {
        System.out.println(name);
    }

}
