package br.unibh;

import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.unibh.entidades.Aluno;
import br.unibh.persistencias.AlunoDAO;

public class Testes {

	@Before
	public void preparaBanco(){
		AlunoDAO dao = new AlunoDAO();
		Aluno a1 = new Aluno(null, new Long(1234), "Danilo", "07158208699", new Date());
		Aluno a2 = new Aluno(null, new Long(5789), "Bruno", "10109906675", new Date());
		Aluno a3 = new Aluno(null, new Long(1357), "Gustavo", "321654987", new Date());
		dao.insert(a1);
		dao.insert(a2);
		dao.insert(a3);
	}
	
	@After
	public void limpaBanco(){
		AlunoDAO dao = new AlunoDAO();
		dao.clean();
	}
	
	@Test
	public void testeBuscarAluno(){
		
		AlunoDAO dao = new AlunoDAO();
		Aluno a = dao.find(1L);
		Assert.assertEquals(a.getCpf(), "07158208699");
	}

	@Test
	public void testeInsertAluno(){
		
		AlunoDAO dao = new AlunoDAO();
		Aluno a = new Aluno(null, 12321L, "Tómaz Gonzaga",
				"34234342", new Date());
		dao.insert(a);
		Aluno a2 = dao.find(4L);
		Assert.assertEquals(a2.getCpf(), "34234342");	
	}
	
	@Test
	public void testeAtualizaAluno(){
		AlunoDAO dao = new AlunoDAO();
		Aluno a = dao.find("07158208699");
		a.setNome("CHESSUS");
		dao.update(a);
		Aluno a2 = dao.find("07158208699");
		Assert.assertEquals(a2.getNome(), "CHESSUS");
	}
	
	@Test
	public void testeExcluirAluno(){
		AlunoDAO dao = new AlunoDAO();
		Aluno a = dao.find("07158208699");
		dao.delete(a);
		List<Aluno> lista = dao.findAll();
		Assert.assertEquals(lista.size(), 2);
	}

	@Test
	public void testeSelecionarTodosAluno(){
		AlunoDAO dao = new AlunoDAO();
		List<Aluno> lista = dao.findAll();
		Assert.assertEquals(lista.size(), 3);
	}

}