package fca.cafeteria.domain;

import fca.cafeteria.data.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CatalogoRepository implements BebidaService {
    //Implementa la interfaz BebidaService

    @Autowired
    private BebidaRepository bebidaRepository;

    @Autowired
    private TipoBebidaRepository tipobebidaRepository;

    //Se inyectan los repositorios para acceder a la base de datos

    @Override
    public Bebida agregarBebida(String nombre, String descripcion, String tipo) {
        //Se sobreescibe el metodo definido en BebidaService

        Optional<Bebida> bebidaExistente = bebidaRepository.findByNombre(nombre);
        //Busca si existe una bebida con ese nombre

        if (bebidaExistente.isPresent()) {
            throw new IllegalArgumentException("La bebida ya existe");
        }
        //Si existe, manda el siguiente mensaje

        TipoBebida tipoBebida = tipobebidaRepository.findByDescripcion(tipo)
                .orElseGet(() -> {
                    TipoBebida nuevoTipo = new TipoBebida();
                    nuevoTipo.setDescripcion(tipo);
                    return tipobebidaRepository.save(nuevoTipo);
                });
        //Busca el tipo de bebida. Si no existe, lo crea y lo guarda

        Bebida nueva = new Bebida();
        nueva.setNombre(nombre);
        nueva.setDescripcion(descripcion);
        nueva.setTipoBebida(tipoBebida);
        //Crea la nueva bebida

        return bebidaRepository.save(nueva);
        //Guarda la bebida en la base de datos

    }

}
