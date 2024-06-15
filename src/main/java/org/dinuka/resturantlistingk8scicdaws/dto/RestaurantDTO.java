package org.dinuka.resturantlistingk8scicdaws.dto;

import java.util.List;
import java.util.Set;

public record RestaurantDTO(Long id,
                            String name,
                            AddressDTO address,
                            List<EmployeeDTO> employees,
                            Set<MenuDTO> menus) {
    @Override
    public String toString() {
        return "RestaurantDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", employees=" + employees +
                ", menus=" + menus +
                '}';
    }
}
