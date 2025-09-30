package fca.cafeteria.data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="ttipobebida")

public class TipoBebida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Setter
    @Getter
    @Column(name="descripcion")
    private String descripcion;

    @OneToMany(mappedBy = "tipoBebida")
    private List<Bebida> bebidas;

}
