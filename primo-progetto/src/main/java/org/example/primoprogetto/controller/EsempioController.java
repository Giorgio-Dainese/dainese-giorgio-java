package org.example.primoprogetto.controller;

import org.example.primoprogetto.model.Libro;
import org.example.primoprogetto.model.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EsempioController {

    @Autowired
    LibroRepository libroRepository;

    @GetMapping("/getLibri")
    public List<Libro> getLibri(){
        return libroRepository.findAll();
    }

    @GetMapping("/addLibro")
    public String addLibro(@RequestParam(value = "titolo") String titolo,
                           @RequestParam(value = "autore")String autore,
                           @RequestParam(value = "anno")int anno){
        Libro libro = new Libro();
        libro.setAnno(anno);
        libro.setAutore(autore);
        libro.setTitolo(titolo);
        libroRepository.save(libro);
        return "OK";
    }
}
