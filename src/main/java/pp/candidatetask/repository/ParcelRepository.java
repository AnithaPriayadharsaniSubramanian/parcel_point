package pp.candidatetask.repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import pp.candidatetask.repository.dao.ParcelDAO;

public interface ParcelRepository extends CrudRepository<ParcelDAO, String>{

    Iterable<ParcelDAO> findAll(Sort sort);

   /* private final EntityManager entityManager;

    public ParcelRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<ParcelDAO> findAllByLimit(int limit) {
        return entityManager.createQuery("FROM Parcel AS parcel order by id desc limit :", ParcelDAO.class)
                .setParameter("limit", limit)
                .getResultList();
    }
    */


}
