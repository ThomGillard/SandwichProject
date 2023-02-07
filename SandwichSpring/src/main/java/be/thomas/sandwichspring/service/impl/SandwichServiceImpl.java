package be.thomas.sandwichspring.service.impl;

import be.thomas.sandwichspring.entity.Sandwich;
import be.thomas.sandwichspring.models.SandwichDTO;
import be.thomas.sandwichspring.repository.SandwichRepository;
import be.thomas.sandwichspring.service.SandwichService;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class SandwichServiceImpl implements SandwichService {

    private final SandwichRepository sandwichRepository;

    public SandwichServiceImpl(SandwichRepository sandwichRepository) {
        this.sandwichRepository = sandwichRepository;
    }

    public List<SandwichDTO> getAll() {
        List<Sandwich> sandwiches = sandwichRepository.findAll();
        return sandwiches.stream()
                .map(
                        entity -> SandwichDTO.builder()
                                .id(entity.getId())
                                .name(entity.getName())
                                .desc(entity.getDesc())
                                .price(entity.getPrice())
                                .build()
                )
                .toList();
    }

}