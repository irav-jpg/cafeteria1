package fca.cafeteria.data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Ingrediente")

public class Ingrediente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idIngrediente")
    private int idIngrediente;
    @Setter
    @Getter
    @Column(name="nombre")
    private String nombre;
    @Setter
    @Getter
    @Column(name="descripcion")
    private String descripcion;
    @Setter
    @Getter
    @Column(name="costo")
    private float costo;


}
