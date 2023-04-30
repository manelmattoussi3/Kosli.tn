package com.teskrti.projet_teskrti.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Category implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long idCat;
    @Column(name = "contenu")
    private String contenu;
    @OneToMany(mappedBy = "category")
    private List<Evenement> events;
}
