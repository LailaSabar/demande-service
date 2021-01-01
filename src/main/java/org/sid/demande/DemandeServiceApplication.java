package org.sid.demande;

import java.math.BigDecimal;
import java.util.Date;

import org.sid.demande.entities.DemandeChequier;
import org.sid.demande.feign.AbonneRestClient;
import org.sid.demande.feign.CompteRestClient;
import org.sid.demande.model.Abonne;
import org.sid.demande.model.Compte;
import org.sid.demande.repositories.DemandeChequierRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
@EnableFeignClients
public class DemandeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemandeServiceApplication.class, args);
	}
	
	@Bean
	CommandLineRunner start(DemandeChequierRepository demandeChequierRepository, 
			RepositoryRestConfiguration restConfiguration,
			CompteRestClient compteRestClient
		) {
		restConfiguration.exposeIdsFor(DemandeChequier.class);
		return args->{
			
			DemandeChequier demandeChequier = null;
			
			demandeChequierRepository.save(demandeChequier.builder()
					.id(null)
					.motif("motif")
					.date_creation(new Date())
					.date_execution(new Date())
					.statut("statut")
					.abonne_id(null)
					.abonne(null)
					.compte_id(null)
					.compte(null)
					.montant_chequier(new BigDecimal("50000000"))
					.build());
		
		};
		
	}
}

