package co.com.crudanimals.jpa;

import co.com.crudanimals.jpa.entities.AnimalsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface JPARepository extends CrudRepository<AnimalsEntity/* change for adapter model */, String>,
        QueryByExampleExecutor<AnimalsEntity/* change for adapter model */> {
}
