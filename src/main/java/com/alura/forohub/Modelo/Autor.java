package com.alura.forohub.Modelo;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "usuario")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String correoElectronico;
    private String contraseña;
    @OneToMany(mappedBy = "usuario")
    private List<Topico> topicos;
    @OneToMany(mappedBy = "usuario")
    private List<Respuesta> respuestas;
    @ManyToMany
    private List<Perfil> perfiles;


    public Autor(DatosAutor usuario) {
    }

    public Autor() {

    }
}
