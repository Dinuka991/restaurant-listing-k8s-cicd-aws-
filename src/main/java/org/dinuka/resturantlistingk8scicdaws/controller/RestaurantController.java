package org.dinuka.resturantlistingk8scicdaws.controller;


import org.dinuka.resturantlistingk8scicdaws.dto.RestaurantDTO;
import org.dinuka.resturantlistingk8scicdaws.modal.Restaurant;
import org.dinuka.resturantlistingk8scicdaws.service.RestaurantService;
import org.dinuka.resturantlistingk8scicdaws.util.RestaurantMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/restaurant")
public class RestaurantController {


    private final RestaurantService restaurantService;


    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @GetMapping("/all")
    public ResponseEntity<Set<RestaurantDTO>> getRestaurants(){
        Set<Restaurant> restaurants = restaurantService.getAllRestaurants();
        Logger.getAnonymousLogger().info("restaurants = " + restaurants);

        return ResponseEntity.ok(restaurants.stream()
                .map(RestaurantMapper.INSTANCE::toDto).collect(Collectors.toSet()));
    }

    @PostMapping("/save")
    public ResponseEntity<RestaurantDTO> createRestaurant(@RequestBody RestaurantDTO restaurantDTO) {
        Restaurant restaurant = RestaurantMapper.INSTANCE.toEntity(restaurantDTO);
        Restaurant savedRestaurant = restaurantService.saveRestaurant(restaurant);
        return ResponseEntity.ok(RestaurantMapper.INSTANCE.toDto(savedRestaurant));
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<RestaurantDTO> getRestaurantById(@PathVariable Long id){
        Restaurant restaurant = restaurantService.getRestaurantById(id);
        return  ResponseEntity.ok(RestaurantMapper.INSTANCE.toDto(restaurant));
    }

}
