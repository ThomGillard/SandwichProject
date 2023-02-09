package be.thomas.sandwichspring.service.mapper;


import be.thomas.sandwichspring.models.entity.User;
import be.thomas.sandwichspring.models.form.RegisterForm;
import org.springframework.stereotype.Service;

@Service
public class UserMapper {

    public User toEntity(RegisterForm form){
        if( form == null )
            return null;

        User user = new User();

        user.setEmail( form.getEmail() );
        user.setPassword( form.getPassword() );
        user.setFirstName( form.getFirstName() );
        user.setLastName( form.getLastName() );
        user.setBirthdate( form.getBirthdate() );

        return user;
    }

}
