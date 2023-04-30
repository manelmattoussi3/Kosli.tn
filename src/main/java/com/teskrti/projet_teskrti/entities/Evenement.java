package com.teskrti.projet_teskrti.entities;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Evenement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long idEvent;
    @DateTimeFormat(pattern="dd-MM-yyyy")
    @Temporal(TemporalType.DATE)
    @Column(name = "dateDebut")
    private Date dateDebut;
    @DateTimeFormat(pattern="dd-MM-yyyy")
    @Temporal(TemporalType.DATE)
    @Column(name = "dateFin")
    private Date dateFin;
    @Column(name = "image")
    private String image;
    @Column(name = "contenu")
    private String contenu;
    @Column(name = "lieu")
    private String lieu;
    @Column(name = "price")
    private float price;
    @OneToMany(mappedBy = "event",cascade = {CascadeType.REMOVE , CascadeType.PERSIST})
    private List<LigneCommande> lignescmd;
    @ManyToOne
    private Category category;
    @ManyToOne
    private Utilisateur user;
}
