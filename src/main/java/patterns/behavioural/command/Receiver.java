package patterns.behavioural.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import patterns.behavioural.command.interfaces.Command;

@AllArgsConstructor
@Data
public class Receiver {
    private Command print;
    private Command copy;
    private Command scan;

    public void print() {
        print.execute();
    }

    public void copy() {
        scan.execute();
    }

    public void scan() {
        scan.execute();
    }
}
