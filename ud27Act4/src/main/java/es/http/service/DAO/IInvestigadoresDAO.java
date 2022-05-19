package es.http.service.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import es.http.service.dto.Investigadores;

public interface IInvestigadoresDAO extends JpaRepository<Investigadores, Integer>{

}
