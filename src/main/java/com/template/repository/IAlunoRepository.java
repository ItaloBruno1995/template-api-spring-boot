package com.template.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.template.model.Aluno;

public interface IAlunoRepository extends CrudRepository<Aluno, Long>{

	@Query(value = "SELECT * FROM aluno ORDER BY id DESC", nativeQuery = true)
	List<Aluno> listarClientesSqlQuery() throws Exception;
	
}
