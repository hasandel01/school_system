package org.deliktas.javastudy.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.deliktas.javastudy.id.AdvisorId;
@Entity
@Table(name = "advisor", schema = "school_system")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@IdClass(AdvisorId.class)
public class Advisor {

    @Id
    @Column(name= "s_ID")
    private String studentId;

    @Id
    @Column(name= "i_ID")
    private String instructorId;

    @ManyToOne
    @JoinColumn(name = "i_ID", referencedColumnName = "ID")
    private Instructor instructor;

    @ManyToOne
    @JoinColumn(name = "s_ID", referencedColumnName = "ID")
    private Student student;

}
