package co.com.crudanimals.jpa;

import co.com.crudanimals.jpa.entities.AnimalsEntity;
import co.com.crudanimals.jpa.helper.AdapterOperations;
import co.com.crudanimals.model.animals.Animals;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class JPARepositoryAdapter extends AdapterOperations<
        Animals/* change for domain model */,
        AnimalsEntity/* change for adapter model */,
        String,
        JPARepository>
// implements ModelRepository from domain
{

    public JPARepositoryAdapter(JPARepository repository, ObjectMapper mapper) {
        /**
         *  Could be use mapper.mapBuilder if your domain model implement builder pattern
         *  super(repository, mapper, d -> mapper.mapBuilder(d,ObjectModel.ObjectModelBuilder.class).build());
         *  Or using mapper.map with the class of the object model
         */
        super(repository, mapper, d -> mapper.map(d, Animals.class/* change for domain model */));
    }
}
