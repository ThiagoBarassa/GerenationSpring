package br.com.generation.minhaEscola.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.generation.minhaEscola.Model.Aluno;

	@Repository
	public interface AlunoRepository extends JpaRepository<Aluno, Long> {
		public List<Aluno> findAllByNomeContainingIgnoreCase(String nome);	
	}

