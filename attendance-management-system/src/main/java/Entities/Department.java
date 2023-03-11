package Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Department")

public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String DepartmentId;
    @Column
    private String DepartmentName;
    @Column
    private String Manager;


}
