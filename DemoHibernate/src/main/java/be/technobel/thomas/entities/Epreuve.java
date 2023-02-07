package be.technobel.thomas.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "EPREUVE")
@Data
public class Epreuve {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name = "ANNEE",nullable = false)
    private int annee;

    @Column(name = "TYPE_EPREUVE",nullable = false)
    private int type;

    @ManyToOne
    @JoinColumn(name = "TOURNOI_ID")
    private Tournoi tournoi;

    @OneToMany(mappedBy="epreuve")
    private Set<Match> match = new LinkedHashSet<>();
}