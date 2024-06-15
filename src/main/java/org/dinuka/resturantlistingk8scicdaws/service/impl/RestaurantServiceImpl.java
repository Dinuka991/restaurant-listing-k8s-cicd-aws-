package org.dinuka.resturantlistingk8scicdaws.service.impl;

import org.dinuka.resturantlistingk8scicdaws.modal.Restaurant;
import org.dinuka.resturantlistingk8scicdaws.repository.RestauntantRepository;
import org.dinuka.resturantlistingk8scicdaws.service.RestaurantService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;



@Service
public class RestaurantServiceImpl implements RestaurantService {

    private final RestauntantRepository restaurantRepository;

    public RestaurantServiceImpl(RestauntantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }


    @Override
    public Set<Restaurant> getAllRestaurants() {
        return new HashSet<>(restaurantRepository.findAll());
    }

    @Override
    public Restaurant saveRestaurant(Restaurant restaurant) {
        return  restaurantRepository.save(restaurant);
    }

    @Override
    public Restaurant getRestaurantById(Long id) {
        return restaurantRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteRestaurantById(Long id) {
            restaurantRepository.deleteById(id);
    }

    @Override
    public void updateRestaurantById(Long id, Restaurant restaurant) {
        Restaurant existingRestaurant = restaurantRepository.findById(id).orElse(null);
        if(existingRestaurant != null){
            existingRestaurant.setName(restaurant.getName());
            existingRestaurant.setAddress(restaurant.getAddress());
            existingRestaurant.setEmployees(restaurant.getEmployees());
            existingRestaurant.setMenus(restaurant.getMenus());
            restaurantRepository.save(existingRestaurant);
        }
    }
}
