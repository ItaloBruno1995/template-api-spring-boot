package com.template.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Entity
@Table(name = "aluno", catalog = "BDSPFP_REIA", schema = "dbo")
public class Aluno {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@ApiModelProperty(notes = "Geração do ID de clientes")
	@Column(name="id_aluno")
    private long id;
    
    @Column
    @ApiModelProperty(notes = "Nome do cliente")
    private String nome;
    
    @Column
    @ApiModelProperty(notes = "Telefone do Cliente")
    private String telefone;
    
    @ManyToOne(targetEntity=Curso.class)
	@JoinColumn(name="id_curso")
	private Curso curso;
}
