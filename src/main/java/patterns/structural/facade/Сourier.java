package patterns.structural.facade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Сourier {

    public static void getOrder(){
        log.info("Courier get ordered food");
    }

    public static void deliverFood(){
        log.info("Courier delivered food");
    }

    public static void getPayment(){
        log.info("Courier get money");
    }
}
