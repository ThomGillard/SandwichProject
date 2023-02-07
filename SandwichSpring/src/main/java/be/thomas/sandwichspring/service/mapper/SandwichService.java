package be.thomas.sandwichspring.service.mapper;

import be.thomas.sandwichspring.models.SandwichDTO;
import java.util.List;

public interface SandwichService {

    List<SandwichDTO> getAll();

}
