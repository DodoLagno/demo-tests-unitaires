package fr.diginamic.utils;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringUtilsTest {

    @Test
    public void testLevenshteinDistance() {
        // Tests nominaux
        assertEquals(1, StringUtils.levenshteinDistance("chat", "chats"));
        assertEquals(1, StringUtils.levenshteinDistance("machins", "machine"));
        assertEquals(1, StringUtils.levenshteinDistance("aviron", "avion"));

        // Tests de robustesse
        assertEquals(5, StringUtils.levenshteinDistance("distance", "instance"));
        assertEquals(2, StringUtils.levenshteinDistance("Chien", "Chine"));

        // Test avec des paramètres nuls
        assertEquals(0, StringUtils.levenshteinDistance(null, null)); // Les deux chaînes sont null, la distance est donc 0
        assertEquals(8, StringUtils.levenshteinDistance("distance", null)); // La première chaîne est non null, la distance est la longueur de la première chaîne
        assertEquals(7, StringUtils.levenshteinDistance(null, "instance")); // La deuxième chaîne est non null, la distance est la longueur de la deuxième chaîne

        // Ajoutez d'autres tests au besoin
    }
}
