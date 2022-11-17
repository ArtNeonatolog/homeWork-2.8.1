import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        Set<Integer> numbers = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            int j = random.nextInt(1000);
            numbers.add(j);
            if (j % 2 != 0) {
                numbers.remove(j);
            }
        }
        System.out.println(numbers);
    }
}
