package com.template.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Entity
@Table(name = "curso", catalog = "BDSPFP_REIA", schema = "dbo")
public class Curso {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@ApiModelProperty(notes = "Id Curso")
	@Column(name="id_curso")
    private long id;
    
    @Column
    @ApiModelProperty(notes = "Nome do curso")
    private String nome;
    
    @Column(name="carga_horaria")
    @ApiModelProperty(notes = "Carga horária do Curso")
    private int cargaHoraria;
}
