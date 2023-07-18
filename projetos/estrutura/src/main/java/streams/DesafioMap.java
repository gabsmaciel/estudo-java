package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class DesafioMap {

    public static void main(String[] args) {

        Consumer<String> print = System.out::print;

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        System.out.println("Uso de número para binario...");

        nums.stream()
                .filter(number -> number == 6)
                .map(number -> Integer.toBinaryString(number))
                .forEach(print);

        System.out.println("\n\nInversão para string..");

        nums.stream()
                .filter(number -> number == 6)
                .map(number -> Integer.toBinaryString(number))
                .map(string -> new StringBuilder(string).reverse().toString())
                .forEach(print);

        System.out.println("\n\nConverter de volta para inteiro...");

        for (Integer number : nums) {
            if (number == 6) {
                String string = Integer.toBinaryString(number);
                String s = new StringBuilder(string).reverse().toString();
                Integer parseInt = Integer.parseInt(s, 2);
                print.accept(String.valueOf(parseInt));
            }
        }
    }
}
