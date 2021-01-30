package patterns.structural.flyweight;

import patterns.structural.flyweight.enums.KindOfRepair;

import java.util.HashMap;
import java.util.Map;

public class CarRepairShop {
    private Map<KindOfRepair,Locksmith> kindOfRepairToLocksmith = new HashMap<>();

    public Locksmith getRepairSpecialist(KindOfRepair kindOfRepair) {

        if (kindOfRepair!=null){
            Locksmith locksmith = kindOfRepairToLocksmith.get(kindOfRepair);
            if (locksmith!=null){
                return locksmith;
            }else {
                locksmith = new Locksmith(kindOfRepair);
                kindOfRepairToLocksmith.put(kindOfRepair,locksmith);
                return locksmith;
            }

        }
        return null;
    }
}
