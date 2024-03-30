package org.deliktas.javastudy.id;

import lombok.*;

import java.io.Serializable;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
public class PrerequisiteId implements Serializable {

    private String courseId;

    private String prerequisiteId;
}
