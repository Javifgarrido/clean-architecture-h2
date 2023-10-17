package co.com.crudanimals.usecase.animals;

import co.com.crudanimals.model.animals.Animals;
import co.com.crudanimals.model.animals.gateways.AnimalsRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;

//@RequiredArgsConstructor
@AllArgsConstructor
public class AnimalsUseCase {
    private AnimalsRepository animalsrepo;
    public List<Animals> getAllAnimals() {
        return animalsrepo.getAllAnimals();
    }

    public void create (Animals animal) {
        animalsrepo.create(animal);
    }
    public Animals read(String id) {
        return animalsrepo.read(id);
    }

    public Animals update(Animals animal) {
        animalsrepo.update(animal);
        return animal;
    }
    public void delete(String id) {
        animalsrepo.delete(id);
    }
}
