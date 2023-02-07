package be.technobel.thomas.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name="JOUEUR")
@Data
public class Joueur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private long id;

    @Column(name = "NOM", length = 50,nullable = false)
    private String nom;

    @Column(name = "PRENOM",length = 50)
    private String prenom;

    @Column(name = "GENRE",nullable = false)
    private char genre;
    @OneToMany(mappedBy="vainqueur")
    private Set<Match> matchVainqueur = new LinkedHashSet<>();

    @OneToMany(mappedBy="finaliste")
    private Set<Match> matchFinaliste = new LinkedHashSet<>();

    @ManyToMany(mappedBy = "inscrit")
    private Set<Tournoi> tournois = new LinkedHashSet<>();
}
