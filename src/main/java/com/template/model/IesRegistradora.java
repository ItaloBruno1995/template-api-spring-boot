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
@Table(name = "IesRegistradora", catalog = "BDSPFP_REIA", schema = "dbo")
public class IesRegistradora {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@ApiModelProperty(notes = "Id IesRegistradora")
	@Column(name="Id_iesMissora")
    private long iesRegCodigoMEC;
	
	

	   @Column(name="")
	    private String  iesRegNome;
	   
	   @Column(name="")
	    private String  iesRegCNPJ;
	    
	   @Column(name="")
	    private String  iesRegEndLogradouro;
	    
	   @Column(name="")
	    private String  iesRegEndNumero;
	    
	   @Column(name="")
	    private String  iesRegEndBairro;
	    
	   @Column(name="")
	    private String  iesRegEndCodMunicipio;
	    
	   @Column(name="")
	    private String  iesRegEndNomeMunicipio;
	    
	   @Column(name="")
	    private String  iesRegEndCEP;
	   
	   @Column(name="")
	    private String  iesRegCredTipo;
	   
	   @Column(name="")
	    private String  iesRegCredNumero;
	   
	   @Column(name="")
	    private String  iesRegCredData;
	   
	   @Column(name="")
	    private String  iesRegCredDataPublicacao;
	   
	   @Column(name="")
	    private String  iesRegCredSecaoPublicacao;
	   
	   @Column(name="")
	    private String  iesRegCredPaginaPublicacao;
	   
	   @Column(name="")
	    private String  iesRegRecTipo;
	   
	   @Column(name="")
	    private String  iesRegRecNumero;
	   
	   @Column(name="")
	    private String  iesRegRecData;
	   
	   @Column(name="")
	    private String  iesRegRecDataPublicacao;
	   
	   @Column(name="")
	    private String  iesRegRecSecaoPublicacao;
	   
	   @Column(name="")
	    private String  iesRegRecPaginaPublicacao;
	   
	   
 
	

	
	
	
	
	
	
	
	
	
	
	
}
