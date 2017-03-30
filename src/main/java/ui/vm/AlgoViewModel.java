package ui.vm;

import java.util.List;

import org.uqbar.commons.utils.Observable;

import model.Prenda;
import model.Venta;
import model.repositories.Repositorios;

@Observable
public class AlgoViewModel {

	private List<Venta> ventas;
	public AlgoViewModel() {
		this.ventas = Repositorios.ventas.all();
	}
	
	public List<Venta> getVentas() {
		return ventas;
	}

	
	
}





