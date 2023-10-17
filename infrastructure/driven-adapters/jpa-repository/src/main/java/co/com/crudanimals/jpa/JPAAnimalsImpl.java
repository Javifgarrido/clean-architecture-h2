package co.com.crudanimals.jpa;

import co.com.crudanimals.model.animals.Animals;
import co.com.crudanimals.model.animals.gateways.AnimalsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@AllArgsConstructor
public class JPAAnimalsImpl implements AnimalsRepository {
    private JPARepositoryAdapter jpaRepo;
    public List<Animals> getAllAnimals() {
        return jpaRepo.findAll();
    }
    @Override
    public void create(Animals animal) {
        jpaRepo.save(animal);
    }

    @Override
    public Animals read(String id) {
        return jpaRepo.findById(id);
    }

    @Override
    public Animals update(Animals animal) {
        return jpaRepo.save(animal);
    }

    @Override
    public void delete(String id) {
        jpaRepo.deleteById(id);
    }
}
