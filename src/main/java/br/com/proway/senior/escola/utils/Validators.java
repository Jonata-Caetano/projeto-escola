package br.com.proway.senior.escola.utils;

/**
 * Utilitários do sistema
 * 
 * Esta classe é utilizada para definir métodos que são utilitários de diversas
 * partes do sistema.
 * 
 * @author Jonata Cardoso Caetano.
 *
 */
public class Validators {
	
	/**
	 * Verifica se há caracteres não alfabéticos
	 * 
	 * @param verify String a ser verificada
	 * @return boolean 
	 */
	static public boolean onlyValidChars(String verify) {
		return !verify.matches(
				".*[0-9!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]+.*");
	}
}
