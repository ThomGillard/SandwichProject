package be.thomas.sandwichspring.controller;

import be.thomas.sandwichspring.models.form.RegisterForm;
import be.thomas.sandwichspring.service.AuthService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @GetMapping("/register")
    public String registerForm(@ModelAttribute("form") RegisterForm form){
        return "auth/register-form";
    }

    @PostMapping("/register")
    public String processRegistration(@ModelAttribute("form") @Valid RegisterForm form, BindingResult bindingResult){
        if( bindingResult.hasErrors() ){
            form.setPassword(null);
            return "auth/register-form";
        }

        authService.register(form);
        return "redirect:/";
    }

}