package pe.alexandra.cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.alexandra.cibertec.model.Carrito;

@Repository
public interface CarritoRepository  extends JpaRepository<Carrito, Integer>{

}
