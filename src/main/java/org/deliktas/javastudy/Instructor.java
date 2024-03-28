package org.deliktas.javastudy;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table
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

    @Column(name = "dept_name")
    private String departmentName;

    @Column(name = "salary")
    private Double salary;

}
