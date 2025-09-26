package fca.cafeteria.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface TipoBebidaRepository extends JpaRepository<TipoBebida, Integer> {
    <T> Optional<TipoBebida> findByDescripcion(String descripcion);
}
