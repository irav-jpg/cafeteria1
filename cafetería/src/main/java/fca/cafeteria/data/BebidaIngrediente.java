package fca.cafeteria.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="BebidaIngrediente")

public class BebidaIngrediente {
    @Id
    @Column(name="idBebidaIngrediente")
    private int idBebidaIngrediente;
    @Setter
    @Getter
    @Column(name="cantidad")
    private float cantidad;


}
