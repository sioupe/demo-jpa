package org.example.bibliotheque;

import jakarta.persistence.*;
import org.checkerframework.checker.units.qual.C;

import java.time.LocalDate;
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
        final StringBuilder sb = new StringBuilder("Emprunt{");
        sb.append("client=").append(client);
        sb.append(", id=").append(id);
        sb.append(", dateDebut=").append(dateDebut);
        sb.append(", dateFin=").append(dateFin);
        sb.append(", delai=").append(delai);
        sb.append('}');
        return sb.toString();
    }
}
