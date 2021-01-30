package patterns.creation.factory;

import patterns.creation.factory.enums.TelephoneType;
import patterns.creation.factory.impl.FixedTelephone;
import patterns.creation.factory.impl.MobileTelephone;
import patterns.creation.factory.interfaces.Telephone;

public class TelephoneFactory {

   public static Telephone produceTelephone(TelephoneType telephoneType){
        switch (telephoneType){
            case FIXED:{
                return new FixedTelephone();
            }
            case MOBILE:{
              return new MobileTelephone();
            }
            default:{
                return null;
            }
        }
    }
}
