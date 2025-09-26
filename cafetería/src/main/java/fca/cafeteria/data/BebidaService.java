package fca.cafeteria.data;

import fca.cafeteria.data.Bebida;

public interface BebidaService {
    //Se declara una interfaz que define qué operaciones puede hacer BebidaService

    Bebida agregarBebida(String nombre, String descripcion, String tipo);
    //Metodo que recibe los datos y devuelve una bebida
}

