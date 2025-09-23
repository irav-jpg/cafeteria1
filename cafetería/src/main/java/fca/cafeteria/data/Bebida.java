package fca.cafeteria.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Bebida")

public class Bebida {
    @Id
    @Column(name="idBebida")
    private int idBebida;
    @Setter
    @Getter
    @Column(name="nombre")
    private String nombre;
    @Setter
    @Getter
    @Column(name="descripcion")
    private String descripcion;


}
