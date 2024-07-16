package com.alura.forohub.Modelo;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name= "respuestas")
public class Respuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mensaje;
    private Date fechaCreacion;
    @ManyToOne
    private Autor usuario;
    private Boolean solución;
    @OneToOne
    private Topico topico;

    public Respuesta(List<DatosRespuesta> respuesta) {
    }

    public Respuesta(DatosRespuesta respuesta) {
    }

    public Respuesta() {

    }
}
