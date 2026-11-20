/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.datosestudiante;

/**
 *
 * @author Mathias Andres Jimenez Herrera
 */
import java.util.Scanner;

public class DatosEstudiante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre,carrera;
        int edad;
        double estatura;
        System.out.println("Ingrese su nombre:");
        nombre = sc.nextLine();
        System.out.println("Ingrese su edad:");
        edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese su carrera:");
        carrera = sc.nextLine();
        System.out.println("Ingrese su estatura (en metros, ejemplo 1,70):");
        estatura = sc.nextDouble();
        System.out.println("----- DATOS INGRESADOS -----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " anios");
        System.out.println("Carrera: " + carrera);
        System.out.println("Estatura: " + estatura + " m");
    }
}
