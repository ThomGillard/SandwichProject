package be.technobel.thomas.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "TOURNOI")
@Data
public class Tournoi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name="Name",length = 100,nullable = false)
    private String nom;

    @Column(name = "CODE",length = 2,nullable = false)
    private String code;

    @OneToMany(mappedBy="tournoi")
    private Set<Epreuve> epreuve = new LinkedHashSet<>();

    @ManyToMany
    @JoinTable(
            name = "inscription",
            joinColumns = @JoinColumn(name = "TOURNOI_ID"),
            inverseJoinColumns = @JoinColumn(name = "JOUEUR_ID")
    )
    private Set<Joueur> inscrit = new LinkedHashSet<>();
}
