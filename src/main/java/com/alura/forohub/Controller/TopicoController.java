package com.alura.forohub.Controller;

import com.alura.forohub.Modelo.DatosTopico;
import com.alura.forohub.Modelo.Topico;
import com.alura.forohub.Repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoRepository topicoRepository;

    @PostMapping
    public void registrarTopico(@RequestBody DatosTopico json){
        topicoRepository.save(new Topico(json));
    }
}
