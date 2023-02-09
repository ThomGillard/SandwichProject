package be.thomas.sandwichspring.service.impl;



import be.thomas.sandwichspring.exception.EmailAlreadyTakenException;
import be.thomas.sandwichspring.models.entity.User;
import be.thomas.sandwichspring.models.form.RegisterForm;
import be.thomas.sandwichspring.repository.UserRepository;
import be.thomas.sandwichspring.service.AuthService;
import be.thomas.sandwichspring.service.mapper.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public AuthServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public void register(RegisterForm form) {

        if( userRepository.existsByEmail(form.getEmail()) )
            throw new EmailAlreadyTakenException();

        User user = userMapper.toEntity(form);
        user.setRole("CUSTOMER");

        userRepository.save( user );

    }

}