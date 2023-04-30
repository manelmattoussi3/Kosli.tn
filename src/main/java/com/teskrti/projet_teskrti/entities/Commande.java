package com.teskrti.projet_teskrti.entities;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import com.teskrti.projet_teskrti.entities.*;
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Commande implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long idCommande;
    private int numCommande;
    @DateTimeFormat(pattern="dd-MM-yyyy")
    @Temporal(TemporalType.DATE)
    @Column(name = "dateCreation")
    private Date dateCreation;
    @OneToOne
private Panier panier;
}
