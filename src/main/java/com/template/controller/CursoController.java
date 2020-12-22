package com.template.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.template.business.ICursoBO;
import com.template.model.Curso;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Authorization;

@RestController
@CrossOrigin()
@RequestMapping(value = "/cursos")
@Api(value="curso", description="operações de cursos")
public class CursoController {
	
	@Autowired
	@Qualifier("teste_bean")
	private String testeBean;
	
	@Autowired
	private ICursoBO cursoBO;
	
	@ApiOperation(value = "Mostrar lista de cursos", authorizations = { @Authorization(value="apiKey") })
	@ApiResponses(value = {
		    @ApiResponse(code = 200, message = "Retorna a lista de cursos"),
		    @ApiResponse(code = 401, message = "Você não tem permissão para acessar este recurso"),
		    @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
		})
	@RequestMapping(value = "/listarCurso", method = RequestMethod.GET)
    public ResponseEntity<List<Curso>> listarAluno() {	
		try {
			List<Curso> cursos = (List<Curso>) cursoBO.findAll();
			return new ResponseEntity<>(cursos, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
		}		
		
    }
	
	@ApiOperation(value = "Cadastrar Curso", authorizations = { @Authorization(value="apiKey") })
	@RequestMapping(value = "/cadastrarCurso", method = RequestMethod.POST)
	public ResponseEntity<?> cadastrarCurso(@RequestBody Curso curso) throws Exception {		
		try {
			return new ResponseEntity<>(cursoBO.save(curso), HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
		}
	}
	
}
