package com.pantxi.calculator;

public class ArabicRomanNumerals {

    // Les valeurs et les symboles de 50 à 1, en incluant les cas spéciaux (9, 40, 4)
    private static final int[] ARABIC_VALUES = {
            50, 40, 10, 9, 5, 4, 1
    };
    private static final String[] ROMAN_SYMBOLS = {
            "L", "XL", "X", "IX", "V", "IV", "I"
    };

    /**
     * Convertit un nombre entier positif (<= 50) en chiffres romains.
     * @param nbr Le nombre arabe (entre 1 et 50).
     * @return Le nombre en chiffres romains.
     */
    public static String convert(int nbr) {
        if (nbr < 1 || nbr > 50) {
            throw new IllegalArgumentException("Le nombre doit être compris entre 1 et 50.");
        }
        if (nbr == 50) {
            return "L"; // Cas limite direct
        }

        StringBuilder romain = new StringBuilder();

        // Parcourt les valeurs, de la plus grande à la plus petite
        for (int i = 0; i < ARABIC_VALUES.length; i++) {
            int value = ARABIC_VALUES[i];
            String symbol = ROMAN_SYMBOLS[i];

            // Tant que le nombre est supérieur ou égal à la valeur courante
            while (nbr >= value) {
                romain.append(symbol);
                nbr -= value;
            }
        }
        return romain.toString();
    }
}

