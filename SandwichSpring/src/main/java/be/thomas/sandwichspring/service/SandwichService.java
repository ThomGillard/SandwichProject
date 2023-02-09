package be.thomas.sandwichspring.service;

import be.thomas.sandwichspring.models.dto.SandwichDTO;
import be.thomas.sandwichspring.models.form.SandwichInsertForm;
import be.thomas.sandwichspring.models.form.SandwichUpdateForm;

import java.util.List;

public interface SandwichService {

    List<SandwichDTO> getAll();
    SandwichDTO getOne(Long id);
    void insert(SandwichInsertForm form);
    void update(Long id, SandwichUpdateForm form);
}