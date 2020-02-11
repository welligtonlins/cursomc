package com.welligton.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.welligton.cursomc.domain.Categoria;
import com.welligton.cursomc.repositories.CategoriaRepository;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class CategoriaService {
	@Autowired
	private CategoriaRepository repo;

	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new  com.welligton.cursomc.services.exceptions.ObjectNotFoundException("Objeto nao encontrado ! Id: "+
				id + ", Tipo: "+ Categoria.class.getName()));
	}

}
