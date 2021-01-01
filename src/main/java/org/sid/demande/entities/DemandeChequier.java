package org.sid.demande.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.sid.demande.model.Abonne;
import org.sid.demande.model.Compte;
import org.springframework.format.annotation.NumberFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class DemandeChequier extends Demande{
    @NumberFormat(pattern = "####.#0")
    private BigDecimal montant_chequier;
    
    @Builder
    public DemandeChequier( Long id,String motif,Date date_creation,Date date_execution,String statut,Long abonne_id,
    		Abonne abonne,Long compte_id,Compte compte,BigDecimal montant_chequier) {
    	super( id, motif, date_creation, date_execution, statut, abonne_id,abonne, compte_id, compte);
        this.montant_chequier = montant_chequier;
   
    }
}
