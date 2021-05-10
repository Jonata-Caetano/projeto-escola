package br.com.proway.senior.escola.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.BeforeClass;
import org.junit.Test;

import br.com.proway.senior.escola.model.Aluno;
import br.com.proway.senior.escola.model.Boletim;
import br.com.proway.senior.escola.model.Materia;
import br.com.proway.senior.escola.model.Prova;
import br.com.proway.senior.escola.persistence.ArrayListPersistenceBoletim;

public class BoletimControllerTest {
	static ArrayListPersistenceBoletim persistence = new ArrayListPersistenceBoletim();
	static BoletimController controller;
	static Materia materia;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Aluno aluno = new Aluno();
		Integer periodo = 202105;
		Boletim boletim = new Boletim(aluno, periodo);
		controller = new BoletimController(boletim);
	}

	@Test
	public void testAddProva() {
		Materia materia = new Materia();
		Boletim boletim = controller.getBoletim();
		Prova prova = new Prova(boletim.getPeriodo(), boletim.getAluno(),
				materia);
		controller.addProva(prova);
		persistence.add(boletim);
		assertEquals(1, persistence.dados.size());

	}

	@Test
	public void testRemoveProva() {
		persistence.removeAll();
		Materia materia = new Materia();
		Boletim boletim = controller.getBoletim();
		Prova prova = new Prova(boletim.getPeriodo(), boletim.getAluno(),materia);
		controller.addProva(prova);
		persistence.add(boletim);
		persistence.dados.remove(0);
		assertEquals(0, persistence.dados.size());
	}

	@Test
	public void testRemoveProvaInexistente() {
		Materia materia = new Materia();
		Boletim boletim = controller.getBoletim();
		Prova prova = new Prova(202105, boletim.getAluno(), materia);
		controller.removeTodasProvas();
		controller.addProva(prova);
		controller.addProva(prova);
		controller.removeProva(4);
		assertEquals(2, boletim.getProvas().size());
	}

	@Test
	public void testRemoveTodasProvas() {
		Materia materia = new Materia();
		Boletim boletim = controller.getBoletim();
		Prova prova1 = new Prova(202105, boletim.getAluno(), materia);
		controller.addProva(prova1);
		controller.removeTodasProvas();
		assertFalse(boletim.getProvas().size() > 0);
	}

}
