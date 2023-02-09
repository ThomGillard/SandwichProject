package be.thomas.sandwichspring.service.mapper;

import be.thomas.sandwichspring.models.entity.Sandwich;
import be.thomas.sandwichspring.models.dto.SandwichDTO;
import be.thomas.sandwichspring.models.form.SandwichInsertForm;
import org.springframework.stereotype.Service;


@Service
public class SandwichMapper {
    public SandwichDTO toDTO(Sandwich entity){

        if(entity == null)
            return null;

        return SandwichDTO.builder()
                .id(entity.getId())
                .name(entity.getName())
                .desc(entity.getDescription())
                .price(entity.getPrice())
                .build();

    }

    public Sandwich toEntity(SandwichInsertForm form) {
        return null;
    }
}
