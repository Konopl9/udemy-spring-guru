package mishcma.springweb.recipeproject.repositories;

import java.util.Optional;
import mishcma.springweb.recipeproject.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);

}
