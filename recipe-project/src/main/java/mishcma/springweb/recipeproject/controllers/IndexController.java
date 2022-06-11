package mishcma.springweb.recipeproject.controllers;

import java.util.Optional;
import mishcma.springweb.recipeproject.domain.Category;
import mishcma.springweb.recipeproject.domain.UnitOfMeasure;
import mishcma.springweb.recipeproject.repositories.CategoryRepository;
import mishcma.springweb.recipeproject.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(
        CategoryRepository categoryRepository,
        UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage() {

        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");

        Optional<UnitOfMeasure> unitOfMeasure = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Cat id is: " + categoryOptional.get().getId());
        System.out.println("UOM id is: " + unitOfMeasure.get().getId());
        return "index";
    }
}
