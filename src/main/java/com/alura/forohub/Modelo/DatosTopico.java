package com.alura.forohub.Modelo;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public record DatosTopico(String titulo,
                          String mensaje,
                          String fechaCreacion,
                          String status,
                          DatosAutor usuario,
                          DatosCurso curso,
                          DatosRespuesta respuesta) {
}
