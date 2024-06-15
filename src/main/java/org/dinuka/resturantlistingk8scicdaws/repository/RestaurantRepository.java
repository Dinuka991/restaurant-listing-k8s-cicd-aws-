package org.dinuka.resturantlistingk8scicdaws.repository;

import org.dinuka.resturantlistingk8scicdaws.modal.Restaurant;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

    @EntityGraph(attributePaths = {"address", "employees", "menus"})
    List<Restaurant> findAll();
}
