package be.technobel.thomas.entities;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "MATCH_TENNIS")
@Data
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private long id;

    @ManyToOne
    @JoinColumn(name = "EPREUVE_ID",nullable = false)
    private Epreuve epreuve;

    @ManyToOne
    @JoinColumn(name = "VAINQUEUR_ID",nullable = false)
    private Joueur vainqueur;

    @ManyToOne
    @JoinColumn(name = "FINALISTE_ID",nullable = false)
    private Joueur finaliste;

    @OneToOne(cascade =  CascadeType.ALL,orphanRemoval = true)
    @JoinColumn(name = "SCORE_ID",nullable = false)
    private Score score;
}
