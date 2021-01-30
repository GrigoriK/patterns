package patterns.structural.flyweight;

import general.random.RandomNumber;

import java.util.Arrays;
import java.util.LinkedList;

public class Names {
    private static final LinkedList<String> names = new LinkedList<>(Arrays.asList("Misha", "Pasha", "Vova"));

    public static String getRandomName() {
        return names.get(RandomNumber.getRandomIntNumberByIntRange(0, names.size() - 1));
    }
}
