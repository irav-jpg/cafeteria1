package fca.cafeteria.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="TipoBebida")

public class TipoBebida {
    @Id
    @Column(name="idTipoBebida")
    private int idTipoBebida;
    @Setter
    @Getter
    @Column(name="descripcion")
    private String descripcion;


}
