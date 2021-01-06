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
@Table(name = "IesEmissora", catalog = "BDSPFP_REIA", schema = "dbo")
public class IesEmissora {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@ApiModelProperty(notes = "Id IesEmissora")
	@Column(name="Id_iesMissora")
    private long iesEmiCodigoMEC;
	
	
	   @Column(name="")
	    private String  iesEmiNome;
	   
	   @Column(name="")
	    private String  iesEmiCNPJ;
	    
	   @Column(name="")
	    private String  iesEmiEndLogradouro;
	    
	   @Column(name="")
	    private String  iesEmiEndNumero;
	    
	   @Column(name="")
	    private String  iesEmiEndBairro;
	    
	   @Column(name="")
	    private String  iesEmiEndCodMunicipio;
	    
	   @Column(name="")
	    private String  iesEmiEndNomeMunicipio;
	    
	   @Column(name="")
	    private String  iesEmiEndCEP;
	   
	   @Column(name="")
	    private String  iesEmiCredTipo;
	   
	   @Column(name="")
	    private String  iesEmiCredNumero;
	   
	   @Column(name="")
	    private String  iesEmiCredData;
	   
	   @Column(name="")
	    private String  iesEmiCredDataPublicacao;
	   
	   @Column(name="")
	    private String  iesEmiCredSecaoPublicacao;
	   
	   @Column(name="")
	    private String  iesEmiCredPaginaPublicacao;
	   
	   @Column(name="")
	    private String  iesEmiRecTipo;
	   
	   @Column(name="")
	    private String  iesEmiRecNumero;
	   
	   @Column(name="")
	    private String  iesEmiRecData;
	   
	   @Column(name="")
	    private String  iesEmiRecDataPublicacao;
	   
	   @Column(name="")
	    private String  iesEmiRecSecaoPublicacao;
	   
	   @Column(name="")
	    private String  iesEmiRecPaginaPublicacao;
	   
	   
    
	

}
