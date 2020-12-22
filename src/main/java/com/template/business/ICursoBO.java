package com.template.business;

import java.util.List;

import com.template.model.Curso;

public interface ICursoBO {

	List<Curso> findAll() throws Exception;

	Curso save(Curso curso) throws Exception;

}
