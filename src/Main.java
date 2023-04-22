// Weg 1
import lesson1.MethodExercise;
import lesson1.MethodExercise2;

import java.io.FileNotFoundException;

// Weg 2
//import static lesson1.MethodExercise.addNumbers;

public class Main {
    public static void main(String[] args)  {

        System.out.println("main: " + MethodExercise.addNumbers(5, 3)); //Weg 1
        //System.out.println(addNumbers(5, 3)); // Weg 2
        System.out.println("main: " + MethodExercise2.multiplyNumbers(7, 7));

    }

}