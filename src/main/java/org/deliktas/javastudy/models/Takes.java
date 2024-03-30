package org.deliktas.javastudy.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.deliktas.javastudy.id.TakesId;
import org.hibernate.annotations.Check;

@Entity
@Table(name = "takes",schema = "school_system")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@IdClass(TakesId.class)

public class Takes {

    @Id
    @Column(name = "ID")
    private String id;

    @Id
    @Column(name= "course_id")
    private String courseId;

    @Id
    @Column(name = "sec_id")
    private String sectionId;

    @Id
    @Column(name = "semester")
    private String semester;

    @Id
    @Column(name = "year")
    @Check(constraints = "year > 1701 AND year < 2100")
    private Integer year;

    @Column(name = "grade")
    private String grade;

    @ManyToOne
    @JoinColumn(name = "ID", referencedColumnName = "ID")
    private Student student;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "course_id", referencedColumnName = "course_id"),
            @JoinColumn(name = "sec_id", referencedColumnName = "sec_id"),
            @JoinColumn(name = "semester", referencedColumnName = "semester"),
            @JoinColumn(name = "year", referencedColumnName = "year")
    })
    private Section section;


}


