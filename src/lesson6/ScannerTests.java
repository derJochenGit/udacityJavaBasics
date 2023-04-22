package lesson6;

import java.util.Scanner;

public class ScannerTests {

    public static void main(String[] args) {
        System.out.println("Bitte Namen eingeben: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.nextLine());

        Scanner scanner2 = new Scanner("This is a line");
        System.out.println(scanner2.next());
        System.out.println(scanner2.nextLine());

        Scanner scanner3 = new Scanner("This is a line");
        while (scanner3.hasNext()) {
            System.out.println(scanner3.next());
        }
    }
}
