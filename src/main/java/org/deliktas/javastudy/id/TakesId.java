package org.deliktas.javastudy.id;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class TakesId implements Serializable {
    private String id;
    private String courseId;
    private String sectionId;
    private String semester;
    private Integer year;
}
