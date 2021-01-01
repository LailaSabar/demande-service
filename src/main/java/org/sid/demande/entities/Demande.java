package org.sid.demande.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.sid.demande.model.Abonne;
import org.sid.demande.model.Compte;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Demande {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String motif;
    @Temporal(TemporalType.DATE)
    private Date date_creation;
    @Temporal(TemporalType.DATE)
    private Date date_execution;    
    private String statut;    
    private Long id_abonne;
    @Transient
    private Abonne abonne;    
    private Long id_compte;
    @Transient
    private Compte compte;

}
