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
    private long curCodCurso;
    
    @Column
    @ApiModelProperty(notes = "Nome do curso")
    private String curNomeCurso;
    
    @Column(name="")
    private String  curNomeHabilitacao;
    
    @Column(name="")
    private String  curModalidade;
    
    @Column(name="")
    private String  curTituloConferido;
    
    @Column(name="")
    private String  curGrauConferido;
    
    @Column(name="")
    private String  curEndLogradouro;
    
    @Column(name="")
    private String  curNumero;
    
    @Column(name="")
    private String  curEndComplemento;
    
    @Column(name="")
    private String  curEndBairro;
    
    @Column(name="")
    private String  curEndCodMunicipio;
    
    @Column(name="")
    private String  curEndNomeMunicipio;
    
    @Column(name="")
    private String  curEndUF;
    
    @Column(name="")
    private String  curEndCEP;
    
    @Column(name="")
    private String  curAutTipo;
    
    @Column(name="")
    private String  curAutNumero;
    
    @Column(name="")
    private String  curAutData;
    
    @Column(name="")
    private String  curRecTipo;
    
    @Column(name="")
    private String  curRecNumero;
    
    @Column(name="")
    private String  curRecData;
    
    @Column(name="")
    private String  curRecDataPublicacao;
    
    @Column(name="")
    private String  curCargaHorCurIntegralizada;
    
    @Column(name="")
    private String  curCargaHorCurso;
    
    @Column(name="")
    private String  curIngData;
    
    @Column(name="")
    private String  curFormaAcesso;
    
    @Column(name="")
    private String  curDataConclusao;
    
    
    
}
