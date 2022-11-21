import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        Set<Integer> numbers = new HashSet<>(20);
        for (int i = 0; i < 20; i++) {
            int j = random.nextInt(1000);
            numbers.add(j);
        }
        System.out.println(numbers);
        System.out.println();

        Iterator<Integer> numberIterator = numbers.iterator();
        while (numberIterator.hasNext()) {
            int number = numberIterator.next();
            if (number % 2 != 0) {
                numberIterator.remove();
            }
        }
        System.out.println(numbers);
    }

}
