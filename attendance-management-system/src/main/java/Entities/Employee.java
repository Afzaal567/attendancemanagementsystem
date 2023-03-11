package Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Employee_id;
    @Column(name="name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "contact_no")
    private Double Contact_no;



}
