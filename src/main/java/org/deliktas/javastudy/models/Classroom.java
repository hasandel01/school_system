package org.deliktas.javastudy.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.deliktas.javastudy.id.ClassroomId;

import java.util.Collection;

@Table(name = "classroom",schema = "scool_system")
@Entity
@IdClass(ClassroomId.class)
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Classroom {

    @Id
    @Column(name = "building")
    private String building;

    @Id
    @Column(name= "room_number")
    private String roomNumber;

    @Column(name = "capacity")
    private Integer capacity;

}
