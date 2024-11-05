package org.example.bibliotheque;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="livre")
public class Livre implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "TITRE")
    private String titre;
    @Column(name = "AUTEUR")
    private String auteur;


    public Livre(String titre, String auteur) {

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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Livre{");
        sb.append("auteur='").append(auteur).append('\'');
        sb.append(", id=").append(id);
        sb.append(", titre='").append(titre).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
