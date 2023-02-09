package be.thomas.sandwichspring.repository;

    import be.thomas.sandwichspring.models.entity.Sandwich;
    import org.springframework.data.jpa.repository.JpaRepository;

public interface SandwichRepository extends JpaRepository<Sandwich,Long> {
}


