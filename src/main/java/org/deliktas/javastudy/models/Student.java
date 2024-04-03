package org.deliktas.javastudy.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "student", schema = "school_system")
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Comparable<Student> {

        @Id
        @Column(name = "ID")
        private String id;
        @Column(name = "name")
        private String studentName;
        @Column(name = "dept_name")
        private String departmentName;
        @Column(name = "total_cred")
        private Integer totalCredits;

        @Override
        public int compareTo(Student that) {
                return Integer.compare(this.getTotalCredits(), that.getTotalCredits());
        }
}
