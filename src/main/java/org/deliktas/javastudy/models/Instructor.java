package org.deliktas.javastudy.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Check;

@Table(name = "instructor", schema = "school_system")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Instructor {

    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "name")
    private String instructorName;

    @ManyToOne
    @JoinColumn(name = "dept_name",referencedColumnName = "dept_name")
    private Department department;

    @Column(name = "salary")
    @Check(constraints = "salary > 29000")
    private Double salary;

}
