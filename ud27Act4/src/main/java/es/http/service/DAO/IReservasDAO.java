package es.http.service.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import es.http.service.dto.Reservas;

public interface IReservasDAO extends JpaRepository<Reservas, Integer>{

}
