
package com.mycompany.guardarrazaperros;

import java.util.ArrayList;
import java.util.Scanner;

public class GuardarRazaPerros {

    public static void main(String[] args) {
        ArrayList<String> PerrosDeRaza = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String raza;
        String respuesta;
        do {
            System.out.println("Ingrese una raza: ");
            raza= scanner.nextLine();
            PerrosDeRaza.add(raza);
            System.out.println("Quiere agregar otra raza? (s/n)");
            respuesta= scanner.nextLine();
            
        } while (respuesta.equalsIgnoreCase("s"));
        System.out.println("Raza de perro guardada:");
        for(String r : PerrosDeRaza) {
            System.out.println(r);
        }
        scanner.close();
    }
}
