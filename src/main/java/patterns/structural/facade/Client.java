package patterns.structural.facade;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import patterns.structural.facade.enums.FoodItem;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Data
public class Client {
    private Map<FoodItem, Integer> foodItemToCount = new HashMap<>();

    public void makeOrder() {
        if (foodItemToCount.size() != 0) {
            DeliveryFood.deliverFood(foodItemToCount, this);
        } else {
            log.info("Order is empty");
        }
    }

    public void addFood(FoodItem foodItem, int clientFoodCount) {
        Integer foodCount = foodItemToCount.get(foodItem);
        if (foodCount == null) {
            foodItemToCount.put(foodItem, clientFoodCount);
        } else {
            foodItemToCount.replace(foodItem, foodCount + clientFoodCount);
        }

    }

    public void payForOrder() {
        log.info("Pay for order");
    }
}
