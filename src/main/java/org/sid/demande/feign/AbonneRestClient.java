package org.sid.demande.feign;

import org.sid.demande.model.Abonne;
import org.sid.demande.model.Compte;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="ABONNE-SERVICE")
public interface AbonneRestClient {
	
	@GetMapping(path="/abonnes/{id}")
	Abonne getAbonneById(@PathVariable(name="id") Long id);
	
    @GetMapping("/abonnes")
    PagedModel<Abonne> findAll();
	

}
