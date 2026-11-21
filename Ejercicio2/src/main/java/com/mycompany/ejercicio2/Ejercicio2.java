/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;

/**
 *
 * @author Mathias Andres Jimenez Herrera
 */
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero1, numero2;

        System.out.println("Ingrese el primer número entero:");
        numero1 = sc.nextInt();
        System.out.println("Ingrese el segundo número entero:");
        numero2 = sc.nextInt();

        System.out.println("----- RESULTADOS -----");
        System.out.println("Suma: " + (numero1 + numero2));
        System.out.println("Resta: " + (numero1 - numero2));
        System.out.println("Multiplicación: " + (numero1 * numero2));

        if (numero2 != 0) {
            System.out.println("División: " + ((double) numero1 / numero2));
            System.out.println("Residuo: " + (numero1 % numero2));
        } else {
            System.out.println("División: no se puede dividir para cero");
            System.out.println("Residuo: no se puede calcular con cero");
        }
    }
}