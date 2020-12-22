package com.template.business;

import java.util.List;
import java.util.Optional;

import com.template.model.Aluno;

public interface IAlunoBO {

	List<Aluno> findAll() throws Exception;

	Aluno save(Aluno cliente) throws Exception;

	void deleteById(long id) throws Exception;

	Optional<Aluno> findById(long id) throws Exception;

	List<Aluno> listarAlunosSqlQuery() throws Exception;

}
