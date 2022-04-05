package com.generationblogpessoal.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generationblogpessoal.model.Postagem;
import com.generationblogpessoal.model.TemaPostagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {

	
	public List <Postagem> findAllByTituloContainingIgnoreCase(String titulo);
	
	
	   public Optional <TemaPostagem> findByDescricao(String descricao);
	   
	// SELECT * FROM tb_postagens WHERE  titulo LIKE "%titulo%
	
}

