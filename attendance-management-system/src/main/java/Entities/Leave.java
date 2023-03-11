package Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Leave")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor

public class Leave {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int EmployeeID;
    @Column
    private String typeofLeave;
    @Column

    private String ResonOfLeave;
    @Column
    private String StartDate;
    @Column
    private String EndDate;
}
