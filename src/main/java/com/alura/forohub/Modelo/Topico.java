package com.alura.forohub.Modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name= "topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private String fechaCreacion;
    private String status;
    @OneToOne
    private Respuesta respuesta;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id")
    private Autor usuario;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "curso_id")
    private Curso curso;

//    @OneToMany(mappedBy = "topico")
  //  private List<Respuesta> respuestas;

    public Topico(DatosTopico datosTopico) {
        this.titulo = datosTopico.titulo();
        this.mensaje = datosTopico.mensaje();
        this.fechaCreacion = datosTopico.fechaCreacion();
        this.status = datosTopico.status();
        this.usuario = new Autor(datosTopico.usuario());
        this.curso = new Curso(datosTopico.curso());
        this.respuesta = new Respuesta(datosTopico.respuesta());
    }
}
