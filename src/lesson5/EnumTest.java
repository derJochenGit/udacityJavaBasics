package lesson5;

public class EnumTest {

    enum Stoplight {
        RED,
        YELLOW,
        GREEN
    }

    public static void main(String[] args) {
        Stoplight myStopLight = Stoplight.RED;
        System.out.println(myStopLight);
    }
}
