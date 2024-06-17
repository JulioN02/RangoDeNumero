package rango.de.numero;

import java.util.Scanner;

public class RangoDeNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;

        // Validar que el número ingresado sea mayor que 0
        while (numero <= 0) {
            System.out.print("Ingrese un número entero mayor que 0 y menor que 5000: ");
            numero = scanner.nextInt();

            if (numero <= 0) {
                System.out.println("El número debe ser mayor que 0. Inténtelo nuevamente.");
            }
        }

        // Determinar en qué rango se encuentra el número
        String rango = "";
        if (numero > 4000) {
            rango = "Rango alto (mayor que 4000)";
        } else if (numero >= 2000 && numero <= 4000) {
            rango = "Rango medio (entre 2000 y 4000)";
        } else if (numero < 2000) {
            rango = "Rango bajo (menor que 2000)";
        }

        // Mostrar el resultado
        System.out.println("El número " + numero + " está en el siguiente rango: " + rango);
    }
}

