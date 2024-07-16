package com.alura.forohub.Modelo;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "perfil")
public class Perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    @ManyToMany
    private List<Autor> usuarios;
}
