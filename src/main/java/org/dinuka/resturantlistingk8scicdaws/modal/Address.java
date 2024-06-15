package org.dinuka.resturantlistingk8scicdaws.modal;

import jakarta.persistence.*;
import lombok.*;
import javax.validation.constraints.*;

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

    @NotNull
    @Size(min = 1, max = 100)
    private String street;

    @NotNull
    @Size(min = 1, max = 50)
    private String city;

    @NotNull
    @Size(min = 1, max = 50)
    private String country;

    @NotNull
    @Size(min = 1, max = 15)
    private String zipCode;

    @OneToOne(mappedBy = "address", fetch = FetchType.LAZY)
    private Restaurant restaurant;
}