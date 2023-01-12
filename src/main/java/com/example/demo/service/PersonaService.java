package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.interfaceService.IpersonaService;
import com.example.demo.interfaces.Ipersona;
import com.example.demo.modelo.Persona;

@Service
public class PersonaService implements IpersonaService {
	
	   @Autowired
	    private Ipersona data;
	    
	    @Override
	    public List<Persona> listar() {
	        return (List<Persona>)data.findAll();
	    }
	    
	    @Override
	    public Optional<Persona> listarId(int id) {
	        return data.findById(id);
	    }
	    
	    @Override
	    public int save(Persona p) {
	        return data.save(p) != null ? 1 : 0;
	    }
	
	    @Override
	    public void delete(int id) {
	        data.deleteById(id);
	    }

}
