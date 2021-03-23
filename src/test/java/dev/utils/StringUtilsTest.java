package dev.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilsTest {

	@Test
	public void testLevenshteinDistance() {

		int resultat1 = StringUtils.levenshteinDistance("instance", "distance");

		assertEquals(2, resultat1);
		
		
		int resultat2 = StringUtils.levenshteinDistance("Chien", "Chine");
		
		assertEquals(2,resultat2);
		
		
		int resultat3 = StringUtils.levenshteinDistance(null, null);
		
		

	}
}
