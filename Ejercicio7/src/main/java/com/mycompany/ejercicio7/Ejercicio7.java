/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio7;

/**
 *
 * @author Mathias Andres Jimenez Herrera
 */
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, cantidad = 0, suma = 0;

        System.out.println("Ingrese números positivos (un número negativo termina el programa):");
        numero = sc.nextInt();

        while (numero >= 0) {
            cantidad++;
            suma = suma + numero;
            System.out.println("Ingrese otro número:");
            numero = sc.nextInt();
        }

        System.out.println("----- RESULTADOS -----");
        System.out.println("Cantidad de números ingresados: " + cantidad);
        System.out.println("Suma total: " + suma);
    }
}
