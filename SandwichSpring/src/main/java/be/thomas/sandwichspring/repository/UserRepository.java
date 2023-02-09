package be.thomas.sandwichspring.repository;

import be.thomas.sandwichspring.models.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByEmail(String email);

}