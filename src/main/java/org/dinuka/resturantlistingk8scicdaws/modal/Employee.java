package org.dinuka.resturantlistingk8scicdaws.modal;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employee", indexes = {
        @Index(name = "idx_employee_name", columnList = "name"),
        @Index(name = "idx_employee_contactNumber", columnList = "contactNumber")
})
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;

    private String name;
    private String role;
    private String contactNumber;
    private String hireDate;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "restaurant_id" , referencedColumnName = "id")
    private Restaurant restaurant;

    @CreationTimestamp
    private LocalDateTime createdDate;

    @UpdateTimestamp
    private LocalDateTime updatedDate;
}
