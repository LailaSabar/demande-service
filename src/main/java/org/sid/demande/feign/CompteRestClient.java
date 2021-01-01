package org.sid.demande.feign;


import org.sid.demande.model.Compte;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="COMPTE-SERVICE")
public interface CompteRestClient {
	
	@GetMapping(path="/comptes/{id}")
	Compte getCompteById(@PathVariable(name="id") Long id);
	
    @GetMapping("/comptes")
    PagedModel<Compte> findAll();

}
