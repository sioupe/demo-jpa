package org.example.bibliotheque;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NOM")
    private String nom;

    @Column(name = "PRENOM")
    private String prenom;

    @OneToMany(mappedBy = "client")
    private Set<Emprunt> emprunts;

    public Client(){
        emprunts= new HashSet<Emprunt>();

    }

    public Client( String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
}
