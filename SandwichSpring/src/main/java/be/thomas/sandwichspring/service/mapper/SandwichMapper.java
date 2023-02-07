package be.thomas.sandwichspring.service.mapper;

import be.thomas.sandwichspring.entity.Sandwich;
import be.thomas.sandwichspring.models.SandwichDTO;
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
}
