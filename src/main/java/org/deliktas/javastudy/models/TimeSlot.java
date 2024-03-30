package org.deliktas.javastudy.models;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.deliktas.javastudy.id.TimeSlotId;

@Entity
@Table(name = "time_slot")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TimeSlot {

    @EmbeddedId
    private TimeSlotId id;

    @Column(name = "end_hr")
    private Integer endHr;

    @Column(name = "end_min")
    private Integer endMin;
}
