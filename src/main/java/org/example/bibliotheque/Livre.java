package org.example.bibliotheque;

import jakarta.persistence.*;

@Entity
@Table(name="livre")
public class Livre {
    @Id
    private Integer id;

    public Livre(Integer id) {
        this.id = id;
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
