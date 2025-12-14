package com.pantxi.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

// Assurez-vous que l'import de la classe à tester est correct.
// C'était : import com.pantxi.calculator.OperationsSimples;
// Si OperationsSimples est dans le même package, l'import peut être omis,
// mais s'il est dans un autre package, l'import est nécessaire.

class CalculatorTest { // Cette classe est maintenant la classe de test principale

    @Test
    public void testAddition() {
        OperationsSimples op = new OperationsSimples();
        // Le nom de méthode que vous appeliez dans l'erreur initiale est 'addition'
        assertEquals(5, op.addition(2, 3));
    }

    @Test
    public void testSoustraction() {
        OperationsSimples op = new OperationsSimples();
        // Le nom de méthode que vous appeliez dans l'erreur initiale est 'soustraction'
        assertEquals(1, op.soustraction(3, 2));
    }

    @Test
    public void testEstPair() {
        OperationsSimples op = new OperationsSimples();
        // Le nom de méthode que vous appeliez dans l'erreur initiale est 'testPair'
        assertTrue(op.estPair(4));
        assertFalse(op.estPair(5));
    }

    @Test
    public void testMoyenne() {
        OperationsSimples op = new OperationsSimples();
        // Le nom de méthode que vous appeliez dans l'erreur initiale est 'moyenne'
        assertEquals(5.0, op.moyenne(4.0, 6.0), 0.0001); // Le 0.0001 est la marge d'erreur (delta) pour les doubles
    }
}