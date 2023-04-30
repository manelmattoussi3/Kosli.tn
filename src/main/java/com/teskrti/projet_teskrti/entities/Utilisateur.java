package com.teskrti.projet_teskrti.entities;


import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Utilisateur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUser")
    private long idUser;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "address")
    private String address;
    @Column(name = "email")
    private String email;
    @Column(name = "username")
    private String username;
    @Column(name = "dateBirth")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Temporal(TemporalType.DATE)
    private Date dateBirth;
    @Column(name = "password")
    private String password;
    @Column(name = "picture")
    private String picture;
    @Column(name = "sexe")
    private String sexe;
    @Column(name = "telephone")
    private String tel;
    @OneToMany(mappedBy = "user")
    private List<Evenement> events;
    @OneToOne(mappedBy = "user")
    private Contact contact;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Role> role = new ArrayList<>();
}
