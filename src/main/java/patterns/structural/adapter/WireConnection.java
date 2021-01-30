package patterns.structural.adapter;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public abstract class WireConnection {
   protected Connection connectionOne;
   protected Connection connectionTwo;


    public void connectWire(Equipment equipment) {
        if(connectionOne==null){
            connectionOne = new Connection(equipment);
            log.info(getWireType()+" wire connect to " +getWireType()+
                    " port of "+ equipment.getEquipmentName());
        }else if (connectionTwo ==null){
            connectionTwo = new Connection(equipment);
            log.info(getWireType()+" wire connect to " +getWireType()+
                    " port of "+  equipment.getEquipmentName());
        }else {
            log.info("Wire isn connected to  equipments");
            log.info("Please pull out the wire from some equipment");
        }
    }

    public void reconnectToAnotherEquipment(Equipment equipment){
        if(connectionOne == null){
            log.info("Connection one is free");

        }
        connectionOne = new Connection(equipment);
        log.info(getWireType()+" wire connect To" +getWireType()+
                "port of "+ equipment.getEquipmentName());
    }
    public void reconnectConnectionTwoToAnotherEquipment(Equipment equipment){
        if(connectionTwo == null){
            log.info("Connection two is free");

        }
        connectionTwo = new Connection(equipment);
        log.info(getWireType()+" wire connect To" +getWireType()+
                "port of "+ equipment.getEquipmentName());
    }
    abstract String getWireType();
}
