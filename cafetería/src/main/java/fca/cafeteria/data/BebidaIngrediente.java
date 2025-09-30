package fca.cafeteria.data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="BebidaIngrediente")

public class BebidaIngrediente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idBebidaIngrediente")
    private int idBebidaIngrediente;
    @Setter
    @Getter
    @Column(name="cantidad")
    private float cantidad;


}
