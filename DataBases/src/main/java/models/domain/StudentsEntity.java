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
@Table(name = "students")
public class StudentsEntity {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "username")
    private String Name;

    @Column(name = "group_id")
    private int Group_id;

}
