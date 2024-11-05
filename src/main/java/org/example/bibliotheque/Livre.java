package org.example.bibliotheque;

import jakarta.persistence.*;

@Entity
@Table(name="livre")
public class Livre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "TITRE")
    private String nom;


    public Livre(String nom) {
        this.nom=nom;
    }

    /**
     * Getter
     *
     * @return nom
     */

    public String getNom() {
        return nom;
    }

    /**
     * Getter
     *
     * @return id
     */

    public Integer getId() {
        return id;
    }
}
