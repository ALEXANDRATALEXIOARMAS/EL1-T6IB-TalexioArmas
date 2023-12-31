package pe.alexandra.cibertec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.alexandra.cibertec.model.Producto;
import pe.alexandra.cibertec.repository.ProductoRepository;
  
@Service
public class ProductoServiceImpl implements ProductoService {
     @Autowired
	private ProductoRepository productoRepository;
	
	@Override
	public List<Producto> listar() {
		
		return productoRepository.findAll();
	}

	@Override
	public Producto agregar(Producto producto) {
		
		return  productoRepository.save(producto);
	}
  
}
