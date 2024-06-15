package org.dinuka.resturantlistingk8scicdaws.dto;

public record AddressDTO( Long id,
                          String street,
                          String city,
                          String country,
                          String zipCode) {
    @Override
    public String toString() {
        return "AddressDTO{" +
                "id=" + id +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
