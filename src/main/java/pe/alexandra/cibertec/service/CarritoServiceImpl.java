package pe.alexandra.cibertec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.alexandra.cibertec.model.Carrito;
import pe.alexandra.cibertec.repository.CarritoRepository;

@Service
public class CarritoServiceImpl implements CarritoService{

	@Autowired
	 private CarritoRepository carritoRepository;
	  
	@Override
	public List<Carrito> listar(){
		return carritoRepository.findAll();
	}

}
