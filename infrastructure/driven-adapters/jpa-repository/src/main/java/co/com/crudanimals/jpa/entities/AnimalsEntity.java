package co.com.crudanimals.jpa.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "animals")
public class AnimalsEntity {
    @Id
    private String animalId;
    @Column
    private String name;
    @Column
    private int paws;
    @Column
    private char genere;
    @Column
    private String habitad;
    @Column
    private String species;
    @Column
    private boolean domestic;
}
