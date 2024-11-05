package org.example.bibliotheque;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="livre")
public class Livre implements Serializable {
    @Id
    private Integer id;
    @Column(name = "TITRE")
    private String titre;
    @Column(name = "AUTEUR")
    private String auteur;


    public Livre(Integer id,String titre, String auteur) {
        this.id=id;
        this.titre=titre;
        this.auteur=auteur;

    }

    /**
     * Getter
     *
     * @return auteur
     */

    public String getAuteur() {
        return auteur;
    }

    /**
     * Getter
     *
     * @return nom
     */

    public String getTitre() {
        return titre;
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
