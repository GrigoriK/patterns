package patterns.structural.adapter;

import lombok.extern.slf4j.Slf4j;
import patterns.structural.adapter.interfaces.HDMI;

@Slf4j
public class TV extends Equipment {
    public TV(String equipmentName) {
        super(equipmentName);
    }

    public void connectHDMIToTV(HDMI hdmi) {
        hdmi.connectHDMI(this);

    }

}
