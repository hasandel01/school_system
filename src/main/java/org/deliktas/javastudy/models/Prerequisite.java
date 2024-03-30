package org.deliktas.javastudy.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.deliktas.javastudy.id.PrerequisiteId;

@Entity
@Table(name = "prereq",schema = "school_system")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@IdClass(PrerequisiteId.class)
public class Prerequisite {

    @Id
    @Column(name = "course_id")
    private String courseId;

    @Id
    @Column(name = "prereq_id")
    private String prerequisiteId;

    @ManyToOne
    @JoinColumn(name = "course_id",referencedColumnName = "course_id")
    private Course firstCourse;

    @ManyToOne
    @JoinColumn(name= "prereq_id",referencedColumnName = "course_id")
    private Course secondCourse;

}
