package pl.zaczarowaneslodkosci.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.zaczarowaneslodkosci.entity.CakeEntity;
import pl.zaczarowaneslodkosci.exception.EntityNotFoundException;

import java.util.List;

@Repository
public interface CakeRepository extends JpaRepository<CakeEntity, Long> {

    List<CakeEntity> getByName(String name);

    default CakeEntity getOrThrow(Long id) {
        return findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Entity by id [" + id + "] not exists"));
    }
}