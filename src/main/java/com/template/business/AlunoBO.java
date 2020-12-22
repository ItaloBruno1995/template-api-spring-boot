package com.template.business;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.template.model.Aluno;
import com.template.repository.IAlunoRepository;

@Component
public class AlunoBO implements IAlunoBO {
	
	@Autowired
	private IAlunoRepository alunoRepository;

	@Override
	public List<Aluno> findAll() throws Exception {
		return (List<Aluno>) alunoRepository.findAll();
	}

	@Override
	public Aluno save(Aluno cliente) throws Exception {
		return alunoRepository.save(cliente);
	}

	@Override
	public void deleteById(long id) throws Exception {
		alunoRepository.deleteById(id);
	}

	@Override
	public Optional<Aluno> findById(long id) throws Exception {		
		return alunoRepository.findById(id);
	}

	@Override
	public List<Aluno> listarAlunosSqlQuery() throws Exception {
		return alunoRepository.listarClientesSqlQuery();
	}

}
