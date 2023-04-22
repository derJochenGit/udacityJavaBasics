package lesson1;

public class MethodExercise {

    public static void  main(String[] args) {
        System.out.println("Hello world");
        System.out.println(addNumbers(2,3));
    }
    // benötigt eine main
    // sonst kann die Klasse nicht current file ausgeführt werden

    public static int addNumbers(int num1, int num2) {
        return num1 + num2;
    }
}
