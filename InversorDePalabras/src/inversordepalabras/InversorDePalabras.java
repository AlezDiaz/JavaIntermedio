/*
autor Diaz Delgado Alex
*/
package inversordepalabras;

import java.util.Scanner;

public class InversorDePalabras {

    public static void main(String[] args) {

        String palabra = "", palabrainvertida = "";
        int longitudpalabra = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escribe una palabra o frase: ");
        palabra = entrada.nextLine();

        longitudpalabra = palabra.length();
        
        while (longitudpalabra != 0){ 
            palabrainvertida += palabra.substring(longitudpalabra -1, longitudpalabra);
            longitudpalabra --;

        }
        System.out.print("Palabra invertida: " + palabrainvertida);
        System.out.println("");
    }
    

}
