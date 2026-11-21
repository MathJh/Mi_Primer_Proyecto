/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5;

/**
 *
 * @author Mathias Andres Jimenez Herrera
 */
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double calificacion;
        System.out.println("Ingrese una calificación entre 0 y 10:");
        calificacion = sc.nextDouble();
        if (calificacion < 0 || calificacion > 10) {
            System.out.println("Calificación inválida. Debe estar entre 0 y 10.");
        } else if (calificacion >= 9) {
            System.out.println("Excelente");
        } else if (calificacion >= 8) {
            System.out.println("Muy Bueno");
        } else if (calificacion >= 7) {
            System.out.println("Bueno");
        } else if (calificacion >= 5) {
            System.out.println("Regular");
        } else {
            System.out.println("Deficiente");
        }
    }
}