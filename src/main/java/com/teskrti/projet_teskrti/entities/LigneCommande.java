package com.teskrti.projet_teskrti.entities;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class LigneCommande implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long idLC;
    @Column(name = "quantity")
    private int qte;
    @DateTimeFormat(pattern="dd-MM-yyyy")
    @Temporal(TemporalType.DATE)
    @Column(name = "dateLC")
    private Date dateLC;
    @ManyToOne(fetch = FetchType.EAGER)
    private Panier panier;
    @ManyToOne(fetch = FetchType.EAGER)
    private Evenement event;

}
