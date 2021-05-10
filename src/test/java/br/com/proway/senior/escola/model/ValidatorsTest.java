package br.com.proway.senior.escola.model;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.proway.senior.escola.utils.Validators;

public class ValidatorsTest {

	@Test
	public void testOnlyChars() {
		assertTrue(Validators.onlyValidChars("jadflkjasldkfjakdfj"));
	}
}
