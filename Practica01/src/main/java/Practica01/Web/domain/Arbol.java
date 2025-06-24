package Practica01.Web.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "arbol")
public class Arbol implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idArbol;

    private String nombreComun;
    private String tipoFlor;
    private String rutaImagen;

    private double durezaMadera;
    private double alturaPromedio;
}
