package org.example.bibliotheque;

import jakarta.persistence.*;
import org.checkerframework.checker.units.qual.C;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name="emprunt")
public class Emprunt {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "DATE_DEBUT")
    private LocalDate dateDebut;

    @Column(name = "DATE_FIN")
    private LocalDate dateFin;

    @Column(name = "DELAI")
    private int delai;

    @ManyToOne
    @JoinColumn(name = "ID_CLIENT")
    private Client client;

    @ManyToMany
    @JoinTable(name = "compo",
        joinColumns = @JoinColumn(name = "ID_EMP",referencedColumnName = "ID"),
        inverseJoinColumns = @JoinColumn(name = "ID_LIV",referencedColumnName = "ID")
    )
    private Set<Livre>livres;

    /**
     * Getter
     *
     * @return livres
     */

    public Set<Livre> getLivres() {
        return livres;
    }

    public Emprunt(){

    }

    public Emprunt(Client client, LocalDate dateDebut, LocalDate dateFin, int delai) {
        this.client = client;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.delai = delai;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Emprunt =");
        sb.append(client);
        sb.append(" dateDebut= ").append(dateDebut);
        sb.append(" dateFin= ").append(dateFin);
        sb.append(" delai= ").append(delai).append(" jour \n");

        return sb.toString();
    }
}
