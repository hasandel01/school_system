package org.deliktas.javastudy.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.deliktas.javastudy.id.SectionId;
import org.hibernate.annotations.Check;



@Entity
@Table(name = "section", schema = "school_system")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@IdClass(SectionId.class)
public class Section {

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
    @JoinColumn(name = "course_id", referencedColumnName = "course_id")
    private Course course;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "building", referencedColumnName = "building"),
            @JoinColumn(name = "room_number", referencedColumnName = "room_number")
    })
    private Classroom classroom;


    @Column(name = "time_slot_id")
    private String timeSlotId;


}
