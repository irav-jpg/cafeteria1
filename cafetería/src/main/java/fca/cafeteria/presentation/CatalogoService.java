package fca.cafeteria.presentation;

import fca.cafeteria.data.Bebida;
import fca.cafeteria.data.CatalogoController;
import fca.cafeteria.domain.CatalogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bebidas")
public class CatalogoService {

    @Autowired
    private CatalogoRepository bebidadomain;

    //Inyecta BebidaDomain para no tener que instanciarlo manualmente

    @PostMapping
    //El metodo responde a peticiones HTTP POST

    public ResponseEntity<?> crearBebida(@RequestBody CatalogoController datos) {
        //metodo que recibe un cuerpo de petición (@RequestBody) con los datos de la bebida. Devuelve una respuesta HTTP

        try {
            String nombreBebida = datos.getNombre();
            String descripcionBebida = datos.getDescripcion();
            String tipoBebida = datos.getTipo();
            Bebida bebida = bebidadomain.agregarBebida(nombreBebida, tipoBebida, descripcionBebida);
            return ResponseEntity.status(HttpStatus.CREATED).body(bebida);
            //Llama a domain para agregar la bebida, pasando los datos del CatalogoController. Si no existe la bebida la crea

        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
            //Si la bebida ya existe devuelve un mensaje de error

        }
    }

}

