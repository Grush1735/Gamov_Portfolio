package models.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@EqualsAndHashCode
@Entity
@Table(name = "registration")
public class RegistrationEntity {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "course_name")
    private String courseName;

}
