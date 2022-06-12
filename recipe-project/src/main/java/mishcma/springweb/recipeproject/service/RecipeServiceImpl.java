package mishcma.springweb.recipeproject.service;

import java.util.HashSet;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;
import mishcma.springweb.recipeproject.domain.Recipe;
import mishcma.springweb.recipeproject.repositories.RecipeRepository;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(
        RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        log.debug("I'm in the service");
        Set<Recipe> recipeSet = new HashSet<>();

        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
        return recipeSet;
    }
}
