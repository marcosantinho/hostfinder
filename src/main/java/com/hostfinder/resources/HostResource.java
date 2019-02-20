package com.hostfinder.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/hosts")
public class HostResource {

	@RequestMapping(method=RequestMethod.GET)
	public String listar() {
		return " Teste Rest";
	}
	
}
