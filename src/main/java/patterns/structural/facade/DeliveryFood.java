package patterns.structural.facade;

import patterns.structural.facade.enums.FoodItem;

import java.util.Map;

public class DeliveryFood {

    public static void deliverFood(Map<FoodItem, Integer> foodItemToCount, Client client) {
        OrderProcessingCenter.processOrder(foodItemToCount);
        Kitchen.cookFood(foodItemToCount);
        Сourier.deliverFood();
        client.payForOrder();
        Сourier.getPayment();
        OrderProcessingCenter.orderIsFinished();


    }


}
