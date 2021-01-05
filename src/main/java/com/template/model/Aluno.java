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
    private long aluRa;
    
    @Column
    @ApiModelProperty(notes = "Nome do cliente")
    private String aluNome;
    
    @Column(name = "")
    @ApiModelProperty(notes = "sexo do aluno")
    private String aluSexo;
    
    @Column(name = "")
    private String aluNacionalidade;
    
    @Column(name = "")
    private String  aluNatCodMunicipio;
   
    @Column(name = "")
    private String aluNatNomeMunicipio;
    
    @Column(name = "")
    private String aluNatUF;
    
    @Column(name = "")
    private String aluCPF;
    
    @Column(name = "")
    private  String aluRgNumero;
    
    @Column(name = "")
    private String aluRgUF;
    
    @Column(name = "")
    private String aluDataNasc;
    
    @Column(name = "")
    private String aluEmail;
    
    @Column(name = "")
    private String aluSituacaoAluno;
    
    @Column(name = "")
    private String aluSituacaoENADE;
    
    @Column(name = "")
    private String aluGenitorNome1;
    
    @Column(name = "")
    private String aluGenitorSexo1;
    
    @Column(name = "")
    private String aluGenitorNome2;
    
    @Column(name = "")
    private String aluGenitorSexo2;
    
   
    
    
    //RELACIONAMENTO ( UM CURSO PARA VARIOS ALUNOS)
    @ManyToOne(targetEntity=Curso.class)
	@JoinColumn(name="id_curso")
	private Curso curso;
}
