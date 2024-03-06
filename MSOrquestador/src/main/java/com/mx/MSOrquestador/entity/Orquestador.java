package com.mx.MSOrquestador.entity;

import jakarta.persistence.Column;
import lombok.*;
import jakarta.persistence.*;

@Entity
@Table(name = "ORQUESTADOR")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class Orquestador {
	
	@Id
	@Column(name = "ID_ORQUESTADOR")
	private Integer idOrquestador;
	
	@Column(name = "INFORMACION")
	private String informacion;
}
