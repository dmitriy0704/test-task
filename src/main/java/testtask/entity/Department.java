package testtask.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Data
@Entity
public class Department implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "d_id")
    private Long id;


    @Column(name = "d_name")
    private String name;

    @Column(name = "d_description")
    private String description;


    public Department() {
    }
}


