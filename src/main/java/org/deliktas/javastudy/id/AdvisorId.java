package org.deliktas.javastudy.id;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class AdvisorId implements Serializable {

    private String studentId;

    private String instructorId;
}
