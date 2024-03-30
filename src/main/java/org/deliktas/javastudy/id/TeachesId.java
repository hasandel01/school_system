package org.deliktas.javastudy.id;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
public class TeachesId implements Serializable {
    private String ID;
    private String courseId;
    private String sectionId;
    private String semester;
    private Integer year;
}
