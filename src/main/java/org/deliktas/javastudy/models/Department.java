package org.deliktas.javastudy.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Check;

@Entity
@Table(name = "department", schema = "school_system")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Department {

    @Id
    @Column(name = "dept_name")
    private String departmentName;

    @Column(name = "building")
    private String building;

    @Column(name = "budget")
    @Check(constraints = "budget > 0")
    private Double budget;
}
