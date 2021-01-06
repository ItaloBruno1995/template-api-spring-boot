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
@Table(name = "Diploma", catalog = "BDSPFP_REIA", schema = "dbo")
public class Diploma {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@ApiModelProperty(notes = "Id IesRegistradora")
	@Column(name="Id_diploma")
    private long dipNrDiploma;
	

	   @Column(name="")
	    private String  dipLivroDiploma;
	   
	   @Column(name="")
	    private String  dipflsDiploma;
	   
	   @Column(name="")
	    private String  dipNrProcessoSolitacao;
	   
	   @Column(name="")
	    private String  dipDataColacaoGrau;
	   
	   @Column(name="")
	    private String  dipDataEmissaoDiploma;
	   
	   @Column(name="")
	    private String  dipDataRegistroDiploma;
	   
	   @Column(name="")
	    private String  dipRespRegistroNome;
	
	   @Column(name="")
	    private String  dipRespRegistroCPF;
	
	   @Column(name="")
	    private String  dipRespRegistroMatricula;
	
	   
	   @Column(name="")
	    private String  hisDataEmissao;
	   
	   
	   @Column(name="")
	    private String  terNome;
	
	   
	   @Column(name="")
	    private String  terCPF;
	
	   
	   @Column(name="")
	    private String  terCargo;
	
	   
	   @Column(name="")
	    private String  terAtoDesignacao;
	
	
	   
	
}
