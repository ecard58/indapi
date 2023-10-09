package com.residencia.biblioteca.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.residencia.biblioteca.entities.Aluno;
import com.residencia.biblioteca.repositories.AlunoRepository;

@Service
public class AlunoService {
	
//	cinco operações mais comuns (CRUD)
//	recuperar todos os alunos
//	recuperar um aluno pela chave primária
//	cadastrar novo aluno
//	atualizar um registro de aluno
//	deletar um registro de aluno
	
	@Autowired
	AlunoRepository alunoRepo;
	
	public List<Aluno> listarAlunos() {
		return alunoRepo.findAll();
	}
	
	public Aluno buscarAlunoPorId(Integer id) {
		return alunoRepo.findById(id).get();
	}
	
	public Aluno salvarAluno(Aluno aluno) {
		return alunoRepo.save(aluno);
	}
	
	public Aluno autalizarAluno(Aluno aluno) {
		return alunoRepo.save(aluno);
	}
	
	public void deletarAluno(Aluno aluno) {
		alunoRepo.delete(aluno);
//		Aluno confereAlunoDeletado = buscarAlunoPorId(aluno.getNumeroMatriculaAluno());
	}

}
