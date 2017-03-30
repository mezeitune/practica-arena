package model.repositories;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import model.Prenda;
import model.Venta;

public class VentasRepository {

	private List<Venta> ventas = new ArrayList<>();


	public void agregar(Prenda prenda) {
		this.ventas.addAll((Collection<? extends Venta>) prenda);
	}
	
	public List<Venta> all() {
		return this.ventas;
	}

}
