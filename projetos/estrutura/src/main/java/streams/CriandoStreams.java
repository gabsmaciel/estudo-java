package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

    public static void main(String[] args) {

        Consumer<Object> print = System.out::println; ///referencia de metodo. ///anteriormente CONSUMER.

        Stream<String> langs = Stream.of("Java", "Lua", "JS\n");

        langs.forEach(print);

        String[] maisLangs = {"Phyton", "Lisp", "Perl", "Go\n"};

        Stream.of(maisLangs).forEach(print); // passando valores literais

        Arrays.stream(maisLangs).forEach(print); //passando em arrays

        Arrays.stream(maisLangs,1, 2).forEach(print);

        List<String> outraslangs = Arrays.asList("C", "PHP", "Kotlin\n");
        outraslangs.stream().forEach(print);
        outraslangs.parallelStream().forEach(print);

        //Stream.generate(() -> "a").forEach(print); ////gera de forma indefinida.

        // Stream.iterate(0, n -> n+1).forEach(print);

    }
}
