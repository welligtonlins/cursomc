package com.welligton.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.welligton.cursomc.domain.Cliente;
import com.welligton.cursomc.repositories.ClienteRepository;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class ClienteService {
	@Autowired
	private ClienteRepository repo;

	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new  com.welligton.cursomc.services.exceptions.ObjectNotFoundException("Objeto nao encontrado ! Id: "+
				id + ", Tipo: "+ Cliente.class.getName()));
	}

}
