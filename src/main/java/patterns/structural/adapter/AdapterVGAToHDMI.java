package patterns.structural.adapter;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import patterns.structural.adapter.interfaces.HDMI;
import patterns.structural.adapter.interfaces.VGA;

@AllArgsConstructor
@Slf4j
public class AdapterVGAToHDMI implements VGA {
    private HDMI hdmi;


    @Override
    public void connectVGA(Equipment equipment) {
        log.info("Using Adapter VGA to HDMI.");
        hdmi.connectHDMI(equipment);
    }
}
