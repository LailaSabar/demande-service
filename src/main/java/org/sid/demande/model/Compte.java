package org.sid.demande.model;

import lombok.Data;

@Data
public class Compte {

    private Long id;
    private String numero_compte;
    private double solde_compte;
    private double solde_comptable;

   
}
