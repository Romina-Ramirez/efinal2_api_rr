package com.uce.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.repository.IEstudianteRepository;
import com.uce.edu.repository.modelo.Estudiante;

@Service
public class EstudianteServiceImpl implements IEstudianteService {

	@Autowired
	private IEstudianteRepository estudianteRepository;

	@Override
	public void guardarEstudiante(EstudianteTO estudiante) {
		this.estudianteRepository.insertar(this.convertir(estudiante));
	}

	private Estudiante convertir(EstudianteTO estudiante) {
		Estudiante e = new Estudiante();
		e.setNombre(estudiante.getNombre());
		e.setApellido(estudiante.getApellido());
		e.setCedula(estudiante.getCedula());
		return e;
	}

}
