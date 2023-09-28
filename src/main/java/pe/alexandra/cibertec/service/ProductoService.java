package pe.alexandra.cibertec.service;

import java.util.List;

import pe.alexandra.cibertec.model.Producto;

public interface ProductoService {

	public List<Producto> listar();
	public Producto agregar(Producto producto);
	
	
}
