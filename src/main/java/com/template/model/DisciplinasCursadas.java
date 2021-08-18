package com.template.model;

import java.util.List;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



public class DisciplinasCursadas {
	
	
	//UMA DISCIPLINA  TEM UM HISTORICO 

	//@ManyToOne(fetch = FetchType.EAGER)
	//@JoinColumn(name = "tb_pasta_idpasta")
	//private Pastaa  pastaLink;
	
	
	private String hisDisciplina;

	private String hisPeriodo;

	private String hisNota;

	private String hisconceito;

	
	private List<Docentes> docentes;
	
}
