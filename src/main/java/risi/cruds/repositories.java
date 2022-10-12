package risi.cruds;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repositories extends CrudRepository<biodata, Integer>{

}
