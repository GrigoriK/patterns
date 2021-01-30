package patterns.structural.facade;

import lombok.extern.slf4j.Slf4j;
import patterns.structural.facade.enums.FoodItem;

import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
public class OrderProcessingCenter {

    public static void processOrder(Map<FoodItem,Integer> foodItemToCount) {

        log.info("Order contains: {}", foodItemToCount.keySet().stream().map(foodItem -> {
            return foodItemToCount.get(foodItem)+ " portions of "+foodItem.name().toLowerCase();
        })
                .collect(Collectors.joining(", ")));
        callToCustomer();
        log.info("Send order to the kitchen");
        callToCourier();

    }

    public static void callToCustomer(){
        log.info("Call the customer");
    }

    public static void callToCourier(){
        log.info("Call the courier");
        log.info("Send order to the courier");
    }

    public static void sendMessageToCustomer(){
        log.info("Cooking is finished");
        Сourier.getOrder();
        log.info("Сourier is sent to the place where the order was issued ");
    }
    public static void orderIsFinished(){
        log.info("Order is finished");
        log.info("Bon appetite");

    }

}
