package mishcma.springweb.recipeproject.service;

import java.util.Set;
import mishcma.springweb.recipeproject.domain.Recipe;
import org.springframework.stereotype.Service;

@Service
public interface RecipeService {

    Set<Recipe> getRecipes();
}
