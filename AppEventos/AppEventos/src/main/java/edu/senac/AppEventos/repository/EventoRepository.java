package edu.senac.AppEventos.repository;

import org.springframework.data.repository.CrudRepository;

import edu.senac.AppEventos.model.Evento;

public interface EventoRepository extends CrudRepository<Evento, String> {

}
