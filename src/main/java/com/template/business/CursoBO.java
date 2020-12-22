package com.template.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.template.model.Curso;
import com.template.repository.ICursoRepository;

@Component
public class CursoBO implements ICursoBO {

	@Autowired
	private ICursoRepository cursoRepository;
	
	@Override
	public List<Curso> findAll() throws Exception {
		return (List<Curso>) cursoRepository.findAll();
	}

	@Override
	public Curso save(Curso curso) throws Exception {
		return cursoRepository.save(curso);
	}

}
