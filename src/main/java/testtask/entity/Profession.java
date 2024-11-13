package testtask.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import java.io.Serializable;


@Data
@Entity
public class Profession implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    private String name;
    private String description;

//  @OneToOne(mappedBy = "professions")
//    private String employee;
//    private String department;

    public Profession() {
    }
}
