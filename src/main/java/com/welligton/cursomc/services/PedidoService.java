package com.welligton.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.welligton.cursomc.domain.Pedido;
import com.welligton.cursomc.repositories.PedidoRepository;

@Service
public class PedidoService {
	@Autowired
	private PedidoRepository repo;

	public Pedido buscar(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new  com.welligton.cursomc.services.exceptions.ObjectNotFoundException("Objeto nao encontrado ! Id: "+
				id + ", Tipo: "+ Pedido.class.getName()));
	}

}
