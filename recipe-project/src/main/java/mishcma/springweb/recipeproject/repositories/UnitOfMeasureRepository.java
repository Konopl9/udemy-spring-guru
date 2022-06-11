package mishcma.springweb.recipeproject.repositories;

import java.util.Optional;
import mishcma.springweb.recipeproject.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);
}
