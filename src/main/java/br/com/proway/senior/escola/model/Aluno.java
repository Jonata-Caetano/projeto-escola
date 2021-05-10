package br.com.proway.senior.escola.model;

import br.com.proway.senior.escola.utils.Validators;

/**
 * Pessoa que estuda na escola.
 * 
 * Um aluno é uma pessoa que estuda na escola. O aluno frequenta uma Turma
 * {@link Turma} tem Notas {@link Nota} e Boletim {@link Boletim}.
 * 
 * @author Jonata Cardoso Caetano <jonatacaetano88@gmail.com>
 * @see Nota
 * @see Boletim
 * @see Turma
 */

public class Aluno {

	private String nome;

	private String sobrenome;

	/**
	 * idade do aluno.
	 */
	private Integer idade;

	public String getNome() {
		return nome;
	}

	/**
	 * Define primeiro nome do aluno.
	 * 
	 * Utilizar apenas caracteres alfabéticos.
	 * 
	 * @throws Exception Não utilize números no nome do aluno
	 */
	public void setNome(String nomeEntrada) throws Exception {
		if (!Validators.onlyValidChars(nomeEntrada)) {
			throw new Exception("Utilizar apenas caracteres alfabéticos.");
		}
		this.nome = nomeEntrada;
	}

	/**
	 * Último sobrenome do aluno.
	 * 
	 * @return String sobrenome
	 */
	public String getSobrenome() {
		return sobrenome;
	}

	/**
	 * Define o último sobrenome do aluno.
	 * 
	 * Utilizar apenas caracteres alfabéticos.
	 * 
	 * @throws Exception Utilizar apenas caracteres alfabéticos.
	 */

	public void setSobrenome(String sobrenomeEntrada) throws Exception {
		if (!Validators.onlyValidChars(sobrenomeEntrada)) {
			throw new Exception("Utilizar apenas caracteres alfabéticos.");
		}
		this.sobrenome = sobrenomeEntrada;
	}

	/**
	 * Idade em anos.
	 * 
	 * @return Integer idade
	 */
	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idadeEntrada) throws Exception {
		if (idadeEntrada < 0 || idadeEntrada > 130) {
			throw new Exception(
					"Idade precisa ser maior que 0 e menor que 130(inclusive)");
		}
		this.idade = idadeEntrada;
	}

}
