package mishcma.springweb.recipeproject.service;

import mishcma.springweb.recipeproject.commands.IngredientCommand;
import org.springframework.stereotype.Service;

@Service
public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);

    IngredientCommand saveIngredientCommand(IngredientCommand command);

    void deleteById(Long recipeId, Long idToDelete);
}
