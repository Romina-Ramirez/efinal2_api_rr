package com.uce.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uce.edu.service.EstudianteTO;
import com.uce.edu.service.IEstudianteService;

@RestController
@RequestMapping("/estudiantes")
@CrossOrigin
public class EstudianteControllerRestful {

	@Autowired
	private IEstudianteService estudianteService;

	@PostMapping
	public void guardarEstudiante(@RequestBody EstudianteTO estudianteTO) {
		this.estudianteService.guardarEstudiante(estudianteTO);
	}

}
