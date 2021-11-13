package com.utilidad;
import java.util.Scanner;

public class Main {

    /*El reto de hoy consiste en lo siguiente:
    - Lenguaje: Java
    - IDE recomendado: IntelliJ
    - Nivel: Inicial
    - Enunciado: Crea un método que convierta una cadena de texto (String) en un Array de enteros (Integer). El método recibirá como parámetro la cadena y devolverá un ArrayList de tipo Integer. Debes lanzar una excepción en los siguientes casos:
    1) El array no está bien formado (es decir, no tiene [] o , para separar los elementos.
    2) El elemento a convertir no es un entero.
    - Consideraciones: Crea una Clase llamada com.utilidad.Util para meter este método y otros que puedan resultar de utilidad. No se debe instanciar la clase com.utilidad.Util, se debe poder invocar directamente al método a través de com.utilidad.Util.stringToArray()
    pasas “[1,2,3,4,5]”
    y devuelve un array de 5 elementos
 */
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");


        System.out.println("Introduce los numeros separados con comas: ");
        System.out.println("El formato debe ser [X , X , X , X , X ] comenzará y acabará entre [ ] e " +
                "irán separados entre comas.");

        String numeros = scanner.next();
        boolean rules = Conditions.rules(numeros);
        if(rules == true) {
            System.out.println(Util.toString(numeros));
        }
    }
}
