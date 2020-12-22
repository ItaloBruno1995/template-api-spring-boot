package com.template.repository;

import org.springframework.data.repository.CrudRepository;

import com.template.model.Curso;

public interface ICursoRepository extends CrudRepository<Curso, Long>{
	
}
