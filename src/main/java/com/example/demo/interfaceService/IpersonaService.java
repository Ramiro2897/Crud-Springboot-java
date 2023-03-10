package com.example.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.example.demo.modelo.Persona;

public interface IpersonaService {
	//metodos del crud
	public List<Persona>listar();
	public Optional<Persona>listarId(int id);
	public int save(Persona p);
//	public int update(Persona p);
	public void delete(int id);
}
