package patterns.creation.singleton;

import lombok.Getter;
import patterns.creation.singleton.interfaces.Government;

public class Russia implements Government {
    @Getter
    private String name;
    private static Russia russia;


    private Russia() { }

    @Override
    public String toString() {
        return "Russia{" +
                "name='" + name + '\'' +
                '}';
    }

    public static Russia getRussia() {
        if (russia == null) {
            russia = new Russia();
            russia.name = "Russia";
        }
        return russia;
    }

    @Override
    public String getName() {
        return name;
    }
}
