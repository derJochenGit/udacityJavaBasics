package lesson7;

import java.util.ArrayList;

public class CollectionExcercise {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Mike");
        strings.add("Abe");

        for (String name : strings) {
            System.out.println(name);
        }
    }
}
