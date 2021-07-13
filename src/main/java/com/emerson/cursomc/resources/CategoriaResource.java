package com.emerson.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.emerson.cursomc.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
    @RequestMapping(method=RequestMethod.GET)
	public List<Categoria> listar() {
    	
    	List<Categoria> lista = new ArrayList<>();
    	
    	lista.add(new Categoria(1,"Informatica"));
    	lista.add(new Categoria(2,"Escritório"));
    	
		return lista;
	}
}
