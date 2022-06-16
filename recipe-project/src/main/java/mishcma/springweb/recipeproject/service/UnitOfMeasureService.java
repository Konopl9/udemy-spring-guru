package mishcma.springweb.recipeproject.service;

import java.util.Set;
import mishcma.springweb.recipeproject.commands.UnitOfMeasureCommand;
import org.springframework.stereotype.Service;

@Service
public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUnitOfMeasures();
}
