package br.thaisfullstack.agendathais.contatos.modelo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "contatos", path = "contatos")
public interface ContactRepository extends JpaRepository<Contato, Long> {
}