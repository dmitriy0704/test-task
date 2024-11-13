package testtask.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    private String fio;
    private String description;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "professions_id", referencedColumnName = "id")

    private String profession;
    private String department;


    public Employee() {
    }
}
