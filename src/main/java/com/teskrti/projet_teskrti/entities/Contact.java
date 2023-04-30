package com.teskrti.projet_teskrti.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Contact implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long idContact;
    private String sujet;
    private String message;
    @OneToOne
    private Utilisateur user;
}
