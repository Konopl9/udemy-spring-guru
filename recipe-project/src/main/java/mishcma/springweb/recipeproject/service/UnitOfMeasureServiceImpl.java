package mishcma.springweb.recipeproject.service;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import mishcma.springweb.recipeproject.commands.UnitOfMeasureCommand;
import mishcma.springweb.recipeproject.converters.UnitOfMeasureToUnitOfMeasureCommand;
import mishcma.springweb.recipeproject.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Service;

@Service
public class UnitOfMeasureServiceImpl implements UnitOfMeasureService {

    private final UnitOfMeasureRepository unitOfMeasureRepository;
    private final UnitOfMeasureToUnitOfMeasureCommand unitOfMeasureToUnitOfMeasureCommand;

    public UnitOfMeasureServiceImpl(UnitOfMeasureRepository unitOfMeasureRepository, UnitOfMeasureToUnitOfMeasureCommand unitOfMeasureToUnitOfMeasureCommand) {
        this.unitOfMeasureRepository = unitOfMeasureRepository;
        this.unitOfMeasureToUnitOfMeasureCommand = unitOfMeasureToUnitOfMeasureCommand;
    }

    @Override
    public Set<UnitOfMeasureCommand> listAllUnitOfMeasures() {

        return StreamSupport.stream(unitOfMeasureRepository.findAll()
                .spliterator(), false)
            .map(unitOfMeasureToUnitOfMeasureCommand::convert)
            .collect(Collectors.toSet());
    }
}
