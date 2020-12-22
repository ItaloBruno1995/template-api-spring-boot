package com.template.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.template.business.IAlunoBO;
import com.template.model.Aluno;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Authorization;

@RestController
@CrossOrigin()
@RequestMapping(value = "/clientes")
@Api(value="clientes", description="operações de alunos")
public class AlunoController {
	
	@Autowired
	@Qualifier("teste_bean")
	private String testeBean;
	
	@Autowired
	private IAlunoBO alunoBO;
	
	@ApiOperation(value = "Mostrar lista de alunos", authorizations = { @Authorization(value="apiKey") })
	@ApiResponses(value = {
		    @ApiResponse(code = 200, message = "Retorna a lista de alunos"),
		    @ApiResponse(code = 401, message = "Você não tem permissão para acessar este recurso"),
		    @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
		})
	@RequestMapping(value = "/listarAluno", method = RequestMethod.GET)
    public ResponseEntity<List<Aluno>> listarAluno() {	
		try {
			List<Aluno> alunos = (List<Aluno>) alunoBO.findAll();
			return new ResponseEntity<>(alunos, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
		}		
		
    }
	
	@ApiOperation(value = "Cadastrar alunos", authorizations = { @Authorization(value="apiKey") })
	@RequestMapping(value = "/cadastrarAluno", method = RequestMethod.POST)
	public ResponseEntity<?> cadastrarAluno(@RequestBody Aluno aluno) throws Exception {		
		try {
			return new ResponseEntity<>(alunoBO.save(aluno), HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
		}
	}
		
	@ApiOperation(value = "Excluir aluno", authorizations = { @Authorization(value="apiKey") })
	@DeleteMapping("excluirAluno/{id}")	
	public ResponseEntity<HttpStatus> excluirAluno(@PathVariable("id") long id) {
		try {
			alunoBO.deleteById(id);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
		}
	}
	
	@ApiOperation(value = "Editar aluno", authorizations = { @Authorization(value="apiKey") })
	@PutMapping("editarAluno/{id}")
	public ResponseEntity<Aluno> editarAluno(@PathVariable("id") long id, @RequestBody Aluno aluno) {				
		try {
			Optional<Aluno> alunoAtual = alunoBO.findById(id);

			if (alunoAtual.isPresent()) {
				Aluno _aluno = alunoAtual.get();
				_aluno.setNome(aluno.getNome());
				_aluno.setTelefone(aluno.getTelefone());
				return new ResponseEntity<>(alunoBO.save(_aluno), HttpStatus.OK);
			} else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
		}		
	}
	
	@RequestMapping(value = "/listarAlunosSqlQuery", method = RequestMethod.GET)
    public ResponseEntity<List<Aluno>> listarAlunosSqlQuery() {	
		try {
			List<Aluno> alunos = (List<Aluno>) alunoBO.listarAlunosSqlQuery();
			return new ResponseEntity<>(alunos, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
		}		
    }
	
}
