package com.pantxi.calculator;

// L'ordre des éléments dans l'enum est crucial pour la rotation.
enum Orientation {
    NORD, EST, SUD, OUEST;
    // La méthode values() retourne l'array [NORD, EST, SUD, OUEST]
}

public class Personnage {
    private Orientation orientation = Orientation.NORD; // Initialisation à NORD

    public String tourner(int fois) {
        Orientation[] orientations = Orientation.values();
        int nombreOrientations = orientations.length; // 4

        // 1. Trouver l'index de l'orientation actuelle
        int indexActuel = this.orientation.ordinal(); // NORD est 0

        // 2. Calculer le nouvel index
        // La formule modulaire garantit un cycle (0, 1, 2, 3, 0, 1...)
        // L'addition de nombreOrientations gère correctement les nombres négatifs (tourner(-1))
        int nouvelIndex = (indexActuel + fois % nombreOrientations + nombreOrientations) % nombreOrientations;

        // 3. Mettre à jour l'orientation
        this.orientation = orientations[nouvelIndex];

        // 4. Retourner la String demandée
        return this.orientation.toString();
    }
}