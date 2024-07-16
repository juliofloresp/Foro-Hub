package com.alura.forohub.Modelo;

import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

import java.util.List;

public record DatosAutor(String nombre,
                         String correoElectronico,
                         String contraseña,
                         DatosRespuesta respuestas,
                         DatosPerfiles perfiles) {
}
