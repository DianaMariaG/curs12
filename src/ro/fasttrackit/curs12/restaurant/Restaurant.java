package ro.fasttrackit.curs12.restaurant;

import java.util.Objects;
//pt DateObjects vom scrie Record, nu Class

public class Restaurant {
    private final String name;
    private final String city;
    private final RestaurantType type;
    private final int rating;

    public Restaurant(String name, String city, RestaurantType type, int rating) {
        this.name = name;
        this.city = city;
        this.type = type;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public RestaurantType getType() {
        return type;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant that = (Restaurant) o;
        return rating == that.rating && Objects.equals(name, that.name) && Objects.equals(city, that.city) && type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, city, type, rating);
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", type=" + type +
                ", rating=" + rating +
                '}';
    }
}
