package be.technobel.thomas.entities;


import jakarta.persistence.Column;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="SCORE_VAINQUEUR")
@Data
public class Score {

    @Id
    @Column(name="ID")
    private long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "MATCH_ID", nullable = false)
    private Match match;

    @Column(name = "SET_1")
    private Integer set1;

    @Column(name = "SET_2")
    private Integer set2;

    @Column(name = "SET_3")
    private Integer set3;

    @Column(name = "SET_4")
    private Integer set4;

    @Column(name = "SET_5")
    private Integer set5;

}