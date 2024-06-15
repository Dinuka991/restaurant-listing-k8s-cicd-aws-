package org.dinuka.resturantlistingk8scicdaws.modal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "address", indexes = {
        @Index(name = "idx_address_city", columnList = "city"),
        @Index(name = "idx_address_zipCode", columnList = "zipCode")
})
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String street;
    private String city;
    private String country;
    private String zipCode;

    @OneToOne(mappedBy = "address")
    @JsonIgnore
    private Restaurant restaurant;
}
