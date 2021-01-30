package general.random;

public class RandomNumber {

    public static double getRandomNumberByIntRange(int min, int max) {
        return getRandomNumberByDoubleRange(min, max);
    }

    public static int getRandomIntNumberByIntRange(int min, int max) {
        return getRandomIntNumberByDoubleRange(min, max);
    }

    public static int getRandomIntNumberByDoubleRange(double min, double max) {
        return (int) ((Math.random() * ((max - min) + 1)) + min);
    }

    public static double getRandomNumberByDoubleRange(double min, double max) {
        return (Math.random() * ((max - min) + 1)) + min;
    }
}
