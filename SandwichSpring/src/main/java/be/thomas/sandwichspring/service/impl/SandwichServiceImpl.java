package be.thomas.sandwichspring.service.impl;

import be.thomas.sandwichspring.models.dto.SandwichDTO;
import be.thomas.sandwichspring.models.entity.Sandwich;
import be.thomas.sandwichspring.models.form.SandwichInsertForm;
import be.thomas.sandwichspring.models.form.SandwichUpdateForm;
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
        return sandwichRepository.findAll().stream()
                .map( mapper::toDTO )
                .toList();
    }

    @Override
    public SandwichDTO getOne(Long id) {
        return sandwichRepository.findById(id)
                .map( mapper::toDTO )
                .orElseThrow( () -> new RuntimeException("Sandwich not found") );
    }

    @Override
    public void insert(SandwichInsertForm form) {
        if( form == null )
            throw new IllegalArgumentException("form should not be null");

        Sandwich entity = mapper.toEntity(form);
        sandwichRepository.save( entity );
    }

    @Override
    public void update(Long id, SandwichUpdateForm form) {
        Sandwich toUpdate = sandwichRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Sandwich not found"));

        toUpdate.setName( form.getName() );
        toUpdate.setDescription( form.getDesc() );
        toUpdate.setPrice( form.getPrice() );

        sandwichRepository.save(toUpdate);
    }

}