package com.pantxi.calculator; // Mettez le bon package de test

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*; // Utilisation d'AssertJ (point 3)

class PersonnageTest {

    private Personnage personnage;

    // Montage (Setup) - Point 7 de l'exercice précédent
    @BeforeEach
    void setup() {
        personnage = new Personnage(); // Classe Personnage n'existe pas encore -> ECHEC
    }

    @Test
    void testTournerQuatreFois_DoitRetournerNord() {
        // ACT
        String nouvelleOrientation = personnage.tourner(4); // Teste le cycle

        // ASSERT
        assertThat(nouvelleOrientation).isEqualTo("NORD");
    }
}