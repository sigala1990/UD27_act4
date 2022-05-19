package es.http.service.security;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.DAO.IReservasDAO;
import es.http.service.dto.Reservas;
import es.http.service.services.IReservasService;
@Service
public class ReservasServiceImpl implements IReservasService{

	@Autowired
	IReservasDAO iReservasDAO;

	@Override
	public List<Reservas> listarReservas() {
		return iReservasDAO.findAll();
	}

	@Override
	public Reservas guardarReservas(Reservas reservas) {
		return iReservasDAO.save(reservas);
	}

	@Override
	public Reservas reservasXID(int id) {
		return iReservasDAO.findById(id).get();
	}

	@Override
	public Reservas actualizarReservas(Reservas reservas) {
		return iReservasDAO.save(reservas);
	}

	@Override
	public void eliminarReservas(int id) {
		iReservasDAO.deleteById(id);
	}


}
