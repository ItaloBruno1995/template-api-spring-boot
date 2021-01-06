package com.template.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Entity
@Table(name = "Disciplina", catalog = "BDSPFP_REIA", schema = "dbo")
public class Disciplina {
	
	 @Column(name="")
	    private String  hisDisciplina;
	 
	 @Column(name="")
	    private String  hisPeriodo;
	 
	 @Column(name="")
	    private String  hisNota;
	 
	 
	 @Column(name="")
	    private String  hisconceito;
	 
	 
	
	
	
	

}
