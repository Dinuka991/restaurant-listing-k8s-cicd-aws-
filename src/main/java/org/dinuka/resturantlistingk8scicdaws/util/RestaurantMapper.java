package org.dinuka.resturantlistingk8scicdaws.util;

import org.dinuka.resturantlistingk8scicdaws.dto.*;
import org.dinuka.resturantlistingk8scicdaws.modal.*;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RestaurantMapper {

    RestaurantMapper INSTANCE = Mappers.getMapper(RestaurantMapper.class);

    RestaurantDTO toDto(Restaurant restaurant);
    AddressDTO toDto(Address address);
    EmployeeDTO toDto(Employee employee);
    MenuDTO toDto(Menu menu);

    Restaurant toEntity(RestaurantDTO restaurantDTO);
    Address toEntity(AddressDTO addressDTO);
    Employee toEntity(EmployeeDTO employeeDTO);
    Menu toEntity(MenuDTO menuDTO);
}
