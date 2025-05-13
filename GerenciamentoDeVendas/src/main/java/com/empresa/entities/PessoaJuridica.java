package com.empresa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pessoaJuridica")
public class PessoaJuridica {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cnpj;
	
	private String razaoSocial;
}
