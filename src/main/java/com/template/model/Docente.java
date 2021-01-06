package com.template.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Entity
@Table(name = "Docente", catalog = "BDSPFP_REIA", schema = "dbo")
public class Docente {

	@Column(name="")
    private String  docDocenteNome;
 
	@Column(name="")
    private String  docDocenteTitulacao;
 
}
