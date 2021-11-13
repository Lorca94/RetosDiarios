package com.utilidad;

import com.utilidad.Main;

public class Conditions extends Main {

 public static boolean rules(String numeros) throws NumberFormatException {

    //comparamos si el formato es el correcto, debe empezar [, acabar ]y contener al menos una coma.
     if(numeros.startsWith("[") && numeros.endsWith("]") && numeros.contains(",")){
         if(numeros.contains("0") || numeros.contains("1") || numeros.contains("2") || numeros.contains("3") ||
                 numeros.contains("4") || numeros.contains("5") || numeros.contains("6") || numeros.contains("7") ||
                         numeros.contains("8") || numeros.contains("9") || numeros.contains(" ")){
                            return true;
         } else {
             throw new NumberFormatException("Error el formato tiene letras");

         }

     } else {
         throw new NumberFormatException("Error, el formato no es correcto");
     }


 }

}
