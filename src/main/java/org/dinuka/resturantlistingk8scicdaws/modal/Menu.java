package org.dinuka.resturantlistingk8scicdaws.modal;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import javax.validation.constraints.*;

import java.util.Set;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "menu")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 1, max = 100)
    private String name;

    @Size(max = 500)
    private String description;

    @Min(0)
    private double price;

    @NotNull
    @Size(min = 1, max = 50)
    private String category;

    @NotNull
    @Size(min = 1, max = 50)
    private String menuType;

    private String image;

    @ManyToMany(mappedBy = "menus", fetch = FetchType.LAZY)
    private Set<Restaurant> restaurants;
}