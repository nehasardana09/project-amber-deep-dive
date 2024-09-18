import java.util.function.Function;

public void main() {

    Function<String, Integer> sideEffect =
            s -> {
                System.out.println(s);
                return 0;
            };
    for (int i = 0, _ = sideEffect.apply("Starting for-loop");
         i < 10; i++) {
        System.out.println(i);
    }
}