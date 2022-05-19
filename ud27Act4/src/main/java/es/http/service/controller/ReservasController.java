package es.http.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.http.service.dto.Reservas;
import es.http.service.security.ReservasServiceImpl;
@RestController
@RequestMapping("/api")
public class ReservasController {
	@Autowired
	ReservasServiceImpl reservasServiceImpl;
	
	@GetMapping("/reservas")
	public List<Reservas> listarCreservass(){
		return reservasServiceImpl.listarReservas();
	}
	
	
	@PostMapping("/reservas")
	public Reservas salvarReservas(@RequestBody Reservas reservas) {
		
		return reservasServiceImpl.guardarReservas(reservas);
	}
	
	
	@GetMapping("/reservas/{id}")
	public Reservas reservasXID(@PathVariable(name="id") int id) {
		
		Reservas Reservas_xid= new Reservas();
		
		Reservas_xid=reservasServiceImpl.reservasXID(id);
		
		//System.out.println("Reservas XID: "+Reservas_xid);
		
		return Reservas_xid;
	}
	
	@PutMapping("/reservas/{id}")
	public Reservas actualizarReservas(@PathVariable(name="id")int id,@RequestBody Reservas reservas) {
		
		Reservas Reservas_seleccionado= new Reservas();
		Reservas Reservas_actualizado= new Reservas();
		
		Reservas_seleccionado= reservasServiceImpl.reservasXID(id);
		
		Reservas_seleccionado.setInvestigadores(reservas.getInvestigadores());
		Reservas_seleccionado.setEquipos(reservas.getEquipos());
		Reservas_seleccionado.setComienzo(reservas.getComienzo());
		Reservas_seleccionado.setFin(reservas.getFin());
		
		
		
		Reservas_actualizado = reservasServiceImpl.actualizarReservas(Reservas_seleccionado);
		
		//System.out.println("El Reservas actualizado es: "+ Reservas_actualizado);
		
		return Reservas_actualizado;
	}
	
	@DeleteMapping("/reservas/{id}")
	public void eleiminarReservas(@PathVariable(name="id")int id) {
		reservasServiceImpl.eliminarReservas(id);
	}
}
