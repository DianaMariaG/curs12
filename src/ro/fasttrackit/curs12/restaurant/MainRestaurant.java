package ro.fasttrackit.curs12.restaurant;

import java.util.List;

import static ro.fasttrackit.curs12.restaurant.RestaurantType.*;

public class MainRestaurant {
    public static void main(String[] args) {
        RestaurantService restaurantService = new RestaurantService((List.of(
                new Restaurant("Spoon","Oradea",MEDITERANEAN, 4),
                new Restaurant("Marty","Oradea",FUSION,3),
                new Restaurant("Pizza Hut","Cluj-Napoca",GREEK,4),
                new Restaurant("Gospodina","Iasi",ROMANIAN,4)
        )));

        System.out.println(restaurantService.getRestaurantsOfType(ROMANIAN));
        System.out.println(restaurantService.getRestaurantsOfType(null));

        System.out.println(restaurantService.mapNameToCity());
        System.out.println(restaurantService.mapNameToType());

        System.out.println(restaurantService.mapCityToRestaurant());
    }
}
