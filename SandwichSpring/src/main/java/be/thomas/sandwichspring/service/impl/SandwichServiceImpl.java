package be.thomas.sandwichspring.service.impl;

import be.thomas.sandwichspring.entity.Sandwich;
import be.thomas.sandwichspring.models.SandwichDTO;
import be.thomas.sandwichspring.repository.SandwichRepository;
import be.thomas.sandwichspring.service.SandwichService;
import be.thomas.sandwichspring.service.mapper.SandwichMapper;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SandwichServiceImpl implements SandwichService {

    private final SandwichRepository sandwichRepository;
    private final SandwichMapper mapper;

    public SandwichServiceImpl(SandwichRepository sandwichRepository, SandwichMapper mapper) {
        this.sandwichRepository = sandwichRepository;
        this.mapper = mapper;
    }

    @Override
    public List<SandwichDTO> getAll() {
        List<Sandwich> sandwiches = sandwichRepository.findAll();
        return sandwiches.stream()
                .map(mapper::toDTO)
                .toList();
    }

}
