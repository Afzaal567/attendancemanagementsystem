package Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Schedule")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor

public class schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int EmployeeId;
    @Column
    private String StartTime;
    @Column
    private String EndTime;
    @Column
    private String DayOfWeek;

}
