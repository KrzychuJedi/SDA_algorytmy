package org.sda.algorithms.exercises;


import org.sda.algorithms.util.CalcTime;

import java.util.Scanner;

/**
 * @author marek.sobieraj
 * <p>
 * Napisz program, który sprawdza czy liczba jest pierwsza.
 * Wejśćie:
 * W pierwszej linii 𝑛 ∈ ℕ - liczba testów, w kolejnych liniach n liczb z przedziału [1…100000]
 * <p>
 * Wyjście:
 * Dla każdej liczby słowo TAK, jeśli pierwsza; NIE w p.p.
 */
public class Exercise3 {
    private static CalcTime CALC_TIME = new CalcTime();

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // TODO
        // Pobierze od uzytkownika informacje ile przykladow chce sprawdzic
        // Pobierz liczny

        CALC_TIME.start();

        // TODO
        // Sprawdz czy liczba jest pierwsza uzywajac metody isPrime

        CALC_TIME.stop();
        CALC_TIME.display();
    }

    // TODO
    // zaimplementuj metode ktora zwroci true dla kazdej liczby pierwszej
    // i false dla innych
    public static boolean isPrime(int number) {
        return false;
    }
}
