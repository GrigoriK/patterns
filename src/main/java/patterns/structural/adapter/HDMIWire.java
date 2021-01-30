package patterns.structural.adapter;

import lombok.extern.slf4j.Slf4j;
import patterns.structural.adapter.interfaces.HDMI;

@Slf4j
public class HDMIWire extends WireConnection implements HDMI {

    @Override
    public void connectHDMI(Equipment equipment) {
        connectWire(equipment);
    }

    @Override
    String getWireType() {
        return "HDMI";
    }
}
