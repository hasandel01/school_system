package org.deliktas.javastudy.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.deliktas.javastudy.id.TeachesId;
import org.hibernate.annotations.Check;

@Entity
@Table(name = "teaches", schema = "school_system")
@IdClass(TeachesId.class)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Teaches {

    @Id
    @Column(name = "ID")
    private String ID;

    @Id
    @Column(name = "course_id")
    private String courseId;

    @Id
    @Column(name = "sec_id")
    private String sectionId;

    @Id
    @Column(name = "semester")
    @Check(constraints = "semester IN ('Fall', 'Winter', 'Spring', 'Summer')")
    private String semester;


    @Id
    @Column(name = "year")
    @Check(constraints = "year > 1701 AND year < 2100")
    private Integer year;


    @ManyToOne
    @MapsId("instructorId")
    @JoinColumn(name = "ID", referencedColumnName = "ID")
    private Instructor instructor;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "course_id", referencedColumnName = "course_id"),
            @JoinColumn(name = "sec_id", referencedColumnName = "sec_id"),
            @JoinColumn(name = "semester", referencedColumnName = "semester"),
            @JoinColumn(name = "year", referencedColumnName = "year")
    })
    private Section section;

}

