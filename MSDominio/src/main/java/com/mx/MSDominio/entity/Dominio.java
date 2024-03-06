package com.mx.MSDominio.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "DOMINIO")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class Dominio {

	@Id
	@Column(name = "ID_DOMINIO")
	private Integer idDominio;
	
	@Column(name = "INFORMACION")
	private String informacion;
}
