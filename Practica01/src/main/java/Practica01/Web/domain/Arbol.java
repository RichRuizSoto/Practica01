package Practica01.Web.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="arbol")
public class Arbol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idArbol;

    private String nombreComun;
    private String tipoFlor;
    private double durezaMadera;
    private double alturaPromedio;
    private String rutaImagen;
}
