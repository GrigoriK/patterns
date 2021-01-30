package patterns.structural.adapter;

import lombok.extern.slf4j.Slf4j;
import patterns.structural.adapter.interfaces.VGA;

@Slf4j
public class Projector extends Equipment {
    public Projector(String equipmentName) {
        super(equipmentName);
    }

    public void connectVGAToTV(VGA vga) {
        vga.connectVGA(this);

    }

}
