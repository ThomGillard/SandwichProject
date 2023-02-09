package be.thomas.sandwichspring.service;


import be.thomas.sandwichspring.models.form.RegisterForm;

public interface AuthService {

    void register(RegisterForm form);

}
