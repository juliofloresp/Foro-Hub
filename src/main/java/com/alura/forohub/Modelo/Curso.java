package com.alura.forohub.Modelo;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name= "curso")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String nombre;
    String categoria;
    @OneToMany(mappedBy = "curso")
    List<Topico> topicos;

    public Curso(DatosCurso curso) {
    }
}
