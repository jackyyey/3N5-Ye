package org.ye.serveur_avec_bd.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class text {

    @Id  @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public String chose;

}


