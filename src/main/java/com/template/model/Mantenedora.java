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
@Table(name = "mantenedora", catalog = "BDSPFP_REIA", schema = "dbo")
public class Mantenedora {

	

	  @Column
	  @ApiModelProperty(notes = "Nome da matenedora")
	   private String iesEmiManRazaoSocial;
	  
	  
	  @Column(name = "")
	   private String iesEmiManCNPJ;
	  

	  @Column(name = "")
	   private String iesEmiManEndLogradouro;
	  

	  @Column(name = "")
	   private String iesEmiManEndNumero;
	  

	  @Column(name = "")
	   private String iesEmiManEndBairro;
	  

	  @Column(name = "")
	   private String   iesEmiManEndCodMunicipio;
;
	  

	  @Column(name = "")
	   private String iesEmiManEndNomeMunicipio;
	  

	  @Column(name = "")
	   private String iesEmiManEndUF;
	  

	  @Column(name = "")
	   private String iesEmiManEndCEP;
	  
	  
	  
	  
	  
	  
	  
	
}
