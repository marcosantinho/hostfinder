package com.hostfinder.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hostfinder.domain.Host;

@RestController
@RequestMapping(value="/hosts")
public class HostResource {

	@RequestMapping(method=RequestMethod.GET)
	public List<Host> listar() {
		
		
		Host h1 = new Host(1,"e745");
		Host h2 = new Host(2,"e746");
		
		List<Host> lista =new ArrayList<>();
		lista.add(h1);
		lista.add(h2);
		
		return lista;
	}
	
}
