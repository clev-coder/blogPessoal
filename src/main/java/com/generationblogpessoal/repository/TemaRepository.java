package com.generationblogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generationblogpessoal.model.TemaPostagem;

@Repository
	public interface TemaRepository extends JpaRepository<TemaPostagem, Long> {

		
		public List <TemaPostagem> findAllByContaiDescricaoningIgnoreCase(String descricao);
	}
	
	
	

