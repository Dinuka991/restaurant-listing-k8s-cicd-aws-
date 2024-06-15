package org.dinuka.resturantlistingk8scicdaws.service;

import org.dinuka.resturantlistingk8scicdaws.modal.Restaurant;

import java.util.Set;

public interface RestaurantService {

   Set<Restaurant> getAllRestaurants();

    Restaurant saveRestaurant(Restaurant restaurant);

    Restaurant getRestaurantById(Long id);

    void deleteRestaurantById(Long id);

    void updateRestaurantById(Long id, Restaurant restaurant);
}
