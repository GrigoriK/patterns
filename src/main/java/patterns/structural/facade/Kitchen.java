package patterns.structural.facade;

import lombok.extern.slf4j.Slf4j;
import patterns.structural.facade.enums.FoodItem;

import java.util.Map;

@Slf4j
public class Kitchen {

    public static void cookFood(Map<FoodItem, Integer> foodItemToCount) {
        foodItemToCount.forEach(Kitchen::cookFoodItem);
        log.info("Order is ready for delivery");
        sendMessageToCustomer();

    }

    private static void cookFoodItem(FoodItem foodItem, int count) {
        log.info("Start cooking {} portion of {}", count, foodItem.name().toLowerCase());
        log.info("Cooking is finished ");
    }

    private static void sendMessageToCustomer() {
        OrderProcessingCenter.sendMessageToCustomer();
    }
}
