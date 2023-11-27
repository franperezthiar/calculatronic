package com.calculatronic.calculatronic;

import java.util.Scanner;

public class calculatronic {
    Integer sumar (Integer s1, Integer s2){
        return s1+s2;
    }
    Integer restar (Integer s1, Integer s2){
        return s1-s2;
    }
    Integer multiplicar (Integer s1, Integer s2){
        return s1*s2;
    }
    double dividir (Integer s1, Integer s2){
        double r = 0;
        if( !(s1 > 0) ){
            System.out.println("ATENCIÓN: El primer valor no puede ser 0");
            return r;
        }
        else r= (double) s1 /s2;
        return r;
    }

    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in);

        System.out.println("................CALCULATRONIC.......... ");
        System.out.println("Ingrese numerador: ");

        Integer numerador = Integer.valueOf(lectura.next());

        System.out.println("Ingrese denominador: ");

        Integer denominador = Integer.valueOf(lectura.next());

        Integer rsuma = numerador+denominador;
        Integer rresta = numerador-denominador;
        Integer rmult = numerador*denominador;
        double rdiv = (double) numerador/denominador;

        System.out.println("El resultado es: SUMA: " + rsuma + "  RESTA: " + rresta + "  MULTIPLICACIÓN: " + rmult + "  DIVISIÓN: " + rdiv);
    }
}
