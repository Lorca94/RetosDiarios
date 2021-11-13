package com.utilidad;

import com.utilidad.Main;

import java.util.ArrayList;

public class Util extends Main{


    public static ArrayList<Integer> toString(String numeros) {

        //variables necesarias
        ArrayList<Integer> numEnteros = new ArrayList<>();
        char numeroString;
        Integer numero = null;
        //Primero quitamos los corchetes para eso generamos String separados, y le indicamos que la distancia va a ser desde 1
        // Separamos la cadena
        //hasta la distancia máximo menos 1, así cogemos el interior de los corchetes
        String numerosSeparados = numeros.substring(1, numeros.length()-1);

        //recorremos el String
        for(int i = 0; i < numerosSeparados.length(); i++) {

            //comparamos convirtiendo en charat
            if(numerosSeparados.charAt(i) == ',') {
                numEnteros.add(numero);
                numero=null;

            } else if (numerosSeparados.charAt(i) == ' ') {
                continue;

            } else {
                if (numero != null) {
                    numero = (numero * 10);
                    numero = numero + Character.getNumericValue(numerosSeparados.charAt(i));

                } else {
                    numero = Character.getNumericValue(numerosSeparados.charAt(i));

                }
            }

        }
        numEnteros.add(numero);
        return numEnteros;
    }
}
