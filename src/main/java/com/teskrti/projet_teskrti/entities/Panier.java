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
public class Panier implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long idPanier;
    @Column(name = "subtotal")
    private float subtotal;
    @Column(name = "currency")
    private String currency;
    @Column(name = "etat")
    @Enumerated(EnumType.STRING)
    private EtatPanier etat;
    @OneToOne(mappedBy = "panier")
    private Commande commande;
    @OneToMany(mappedBy = "panier",cascade = {CascadeType.REMOVE , CascadeType.PERSIST})
    private List<LigneCommande> lignescmd;
}
