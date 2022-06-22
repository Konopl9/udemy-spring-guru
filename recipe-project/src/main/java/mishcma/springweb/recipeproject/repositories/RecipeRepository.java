package mishcma.springweb.recipeproject.repositories;

import mishcma.springweb.recipeproject.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
