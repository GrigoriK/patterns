package patterns.behavioural.command;

import lombok.AllArgsConstructor;
import patterns.behavioural.command.interfaces.Command;
import patterns.behavioural.command.interfaces.MFP;

@AllArgsConstructor
public class ScanCommand implements Command {
    private MFP mfp;
    @Override
    public void execute() {
      mfp.scan();
    }
}
