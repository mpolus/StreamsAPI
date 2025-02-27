import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        var odds = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .filter(t -> t % 2 != 0)
                .collect(Collectors.toList());

        System.out.println(odds);

    }



}
