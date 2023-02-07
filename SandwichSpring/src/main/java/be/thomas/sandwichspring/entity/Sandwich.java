package be.thomas.sandwichspring.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Sandwich {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sandwich_id", nullable = false)
    private Long sandwich_id;

}