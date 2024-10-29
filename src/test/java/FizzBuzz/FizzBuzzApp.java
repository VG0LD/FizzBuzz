package FizzBuzz;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import java.util.Arrays;

public class FizzBuzzApp {

    private static final Logger logger = LogManager.getLogger(FizzBuzzApp.class);
    private final int[] numbers = new int[100];

    private int[] fillArray () {
        for (int i = 1; i <= numbers.length; i++) {
            numbers[i-1] = i;
        }
        return numbers;
    }

    @Test
    public void printArrayWithCondition() {
        int[] array = fillArray();

        Arrays.stream(array)
                .mapToObj(number -> number % 3 == 0 ? getFizzMsg(number) : getBuzzMsg(number))
                .forEach(System.out::println);
    }

    private String getFizzMsg(int number) {
        return number % 5 == 0 ? "FizzBuzz" : "Fizz";
    }

    private String getBuzzMsg(int number) {
        return number % 5 == 0 ? "Buzz" : String.valueOf(number);
    }

}
