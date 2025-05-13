package com.empresa.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pessoaFisica")
public class PessoaFisica {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cpf;
	
	private String nome;
	
	@OneToMany (mappedBy = "pessoaF")
	private List<Venda> vendas;
}
