package patterns.structural.adapter;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import patterns.structural.adapter.interfaces.HDMI;
import patterns.structural.adapter.interfaces.VGA;

@AllArgsConstructor
@Slf4j
public class AdapterHDMIToVGA implements HDMI {

    private VGA vga;


    @Override
    public void connectHDMI(Equipment equipment) {
        log.info("Using Adapter HDMI to VGA.");
        vga.connectVGA(equipment);
    }
}
