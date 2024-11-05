package org.example.bibliotheque;

import jakarta.persistence.*;

@Entity
@Table(name="livre")
public class Livre {
    @Id
    private Integer id;
    @Column(name = "titre")
    private String nom;


    public Livre(Integer id,String nom) {
        this.id = id;
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
