package org.deliktas.javastudy.id;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class TimeSlotId implements Serializable {
    private String timeSlotId;
    private String day;
    private int startHr;
    private int startMin;
}
