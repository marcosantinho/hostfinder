package com.hostfinder.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hostfinder.domain.Host;
import com.hostfinder.repositories.HostRepository;

@Service
public class HostService {
	
	@Autowired
	private HostRepository repo;
	
	public Host buscar(Integer id) {
		Optional<Host> obj = repo.findById(id);
		return obj.orElse(null);
	}

}
