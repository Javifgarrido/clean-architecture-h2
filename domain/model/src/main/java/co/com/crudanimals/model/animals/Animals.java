package co.com.crudanimals.model.animals;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Animals {
    private String animalId;
    private String name;
    private int paws;
    private char genere;
    private String habitad;
    private String species;
    private boolean domestic;
}
