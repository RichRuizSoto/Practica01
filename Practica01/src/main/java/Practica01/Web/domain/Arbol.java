package Practica01.Web.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "arbol")
public class Arbol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") // <-- Coincide con la BD
    private Long idArbol;

    @Column(name = "nombre_comun")
    private String nombreComun;

    @Column(name = "tipo_flor")
    private String tipoFlor;

    @Column(name = "dureza_madera")
    private int durezaMadera;

    @Column(name = "altura_promedio")
    private double alturaPromedio;

    @Column(name = "imagen_ruta") // <-- Nombre correcto en BD
    private String rutaImagen;
}
