package org.deliktas.javastudy.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Check;

@Entity
@Table(name = "course",schema = "school_system")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Course {

    @Id
    @Column(name = "course_id")
    private String id;

    @Column(name = "title")
    private String title;

    @ManyToOne
    @JoinColumn(name = "dept_name",referencedColumnName = "dept_name")
    private Department department;

    @Column(name = "credits")
    @Check(constraints = "credits > 0")
    private Integer credits;

}
