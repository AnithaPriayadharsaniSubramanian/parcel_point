package pp.candidatetask.repository;

import org.springframework.data.repository.CrudRepository;
import pp.candidatetask.repository.dao.RetailerDAO;

public interface RetailerRepository extends CrudRepository<RetailerDAO, String> {

}
