package com.hostfinder.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hostfinder.domain.Host;
import com.hostfinder.services.HostService;

@RestController
@RequestMapping(value="/hosts")
public class HostResource {
	
	@Autowired
	private HostService service;

	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Host obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
		
		
	}
	
}
