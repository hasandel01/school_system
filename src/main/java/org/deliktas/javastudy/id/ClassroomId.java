package org.deliktas.javastudy.id;

import lombok.*;

import java.io.Serializable;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
public class ClassroomId implements Serializable {

    private String building;
    private String roomNumber;
}
