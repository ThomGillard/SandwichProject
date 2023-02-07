package be.thomas.sandwichspring.service.impl;

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

    @Override
    public List<SandwichDTO> getAll() {
        return null;
    }

}