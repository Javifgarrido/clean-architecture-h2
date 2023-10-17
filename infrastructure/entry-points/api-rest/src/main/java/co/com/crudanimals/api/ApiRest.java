package co.com.crudanimals.api;
import co.com.crudanimals.model.animals.Animals;
import co.com.crudanimals.usecase.animals.AnimalsUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ApiRest {
//    private final MyUseCase useCase;

    private final AnimalsUseCase useCaseAnimals;
    @GetMapping(path = "/hello")
    public String commandName() {
//      return useCase.doAction();
        return "Hello World";
    }
    @GetMapping(path = "/animals")
    public List<Animals> getAllAnimals() {
        return useCaseAnimals.getAllAnimals();
    }

    @PostMapping(path = "/animals")
    public void create(@RequestBody Animals animal) {
        useCaseAnimals.create(animal);
    }
    @GetMapping(path = "/animals/{id}")
    public Animals read(@PathVariable String id) {
        return useCaseAnimals.read(id);
    }

    @PutMapping(path = "/animals/{id}")
    public Animals update(@RequestBody Animals animal) {
        return useCaseAnimals.update(animal);
    }

    @DeleteMapping(path = "/animals/{id}")
    public void delete(@PathVariable String id) {
        useCaseAnimals.delete(id);
    }
}
