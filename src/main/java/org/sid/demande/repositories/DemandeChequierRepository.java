package org.sid.demande.repositories;


import org.sid.demande.entities.DemandeChequier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
public interface DemandeChequierRepository extends JpaRepository<DemandeChequier,Long> {

}
