package org.dinuka.resturantlistingk8scicdaws.repository;

import org.dinuka.resturantlistingk8scicdaws.modal.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestauntantRepository extends JpaRepository<Restaurant, Long> {
}
