package fca.cafeteria.data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="tbebida")

public class Bebida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Setter
    @Getter
    @Column(name="nombre")
    private String nombre;
    @Setter
    @Getter
    @Column(name="descripcion")
    private String descripcion;

    @Setter
    @ManyToOne
    @JoinColumn(name = "idtipobebida")
    private TipoBebida tipoBebida;


}
