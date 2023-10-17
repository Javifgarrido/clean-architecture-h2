package co.com.crudanimals.model.animals.gateways;

import co.com.crudanimals.model.animals.Animals;

import java.util.List;

public interface AnimalsRepository {
    default List<Animals> getAllAnimals() {
        return null;
    }

    void create(Animals animal);

    Animals read(String id);

    default Animals update(Animals animal) {
        return animal;
    };

    void delete(String id);
}
