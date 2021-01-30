package patterns.structural.adapter;

import lombok.extern.slf4j.Slf4j;
import patterns.structural.adapter.interfaces.VGA;

@Slf4j
public class VGAWire extends WireConnection implements VGA {

    @Override
    public void connectVGA(Equipment equipment) {
        connectWire(equipment);
    }

    @Override
    String getWireType() {
        return "VGA";
    }
}
