package Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Attendance")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor

public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int EmployeeID;
    @Column
    private String date;
    @Column
    private String time_In;
    @Column
    private String time_out;

}
