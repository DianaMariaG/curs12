package ro.fasttrackit.curs12.restaurant;

import java.util.*;

public class RestaurantService { //nu e DateObject, are obiecte business
    private final List<Restaurant> restaurants;

    public RestaurantService(Collection<Restaurant> restaurants) {
        this.restaurants = restaurants == null
                ? new ArrayList<>()
                : new ArrayList<>(restaurants);
    }

    public List<Restaurant> getRestaurantsOfType(RestaurantType type) {
        List<Restaurant> result = new ArrayList<>();

        for (Restaurant restaurant : restaurants) {
            if (restaurant.getType() == type) { //enum se pot compara cu ==, nu e un String
                result.add(restaurant);
            }
        }
        return result;
    }

    public Map<String, String> mapNameToCity() {
        Map<String, String> result = new HashMap<>();
        for (Restaurant restaurant : restaurants) {
            result.put(restaurant.getName(), restaurant.getCity());
        }
        return result;
    }

    public Map<String, RestaurantType> mapNameToType() {
        Map<String, RestaurantType> result = new HashMap<>();
        for (Restaurant restaurant : restaurants) {
            result.put(restaurant.getName(), restaurant.getType());
        }
        return result;
    }

    public Map<String, List<Restaurant>> mapCityToRestaurant() {
        Map<String, List<Restaurant>> result = new HashMap<>();
        for (Restaurant restaurant : restaurants) {
            List<Restaurant> cityRestaurants = result.get(restaurant.getCity());

            if (cityRestaurants == null) {

                cityRestaurants = new ArrayList<>(); //daca n-am avut restaurant din acel oras, cream lista
                result.put(restaurant.getCity(), cityRestaurants); //pun restaurantul in lista
            }
                cityRestaurants.add(restaurant);
        }
        return result;
    }
}
