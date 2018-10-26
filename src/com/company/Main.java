package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner escaner = new Scanner(System.in);
        System.out.println("Introduzce el día");
        int dia = escaner.nextInt();
        System.out.println("Introduzce el mes");
        int mes = escaner.nextInt();
        System.out.println("Introduzce el año: ");
        int año = escaner.nextInt();

        int dia_incrementado = dia+1;

        // para hacer este ejercicio he partido del ejercicio 16

        //Para el caso de los meses de 30:
        // Los meses con 30 dias son Abril, Junio, Septiembre y Noviembre, osea, los meses 4,6,9 y 11
        // Por tanto, mediante if le decimos que si  el dia es mayor o igual a 1 y menor o igual a 30
        // y que ademas si elegimos los meses 4 o 6 o 9 u 11, nos va a imprimir la fecha y nos dirá que es correcta


        if ((dia >= 1 && dia <= 30)&&(mes == 4 || mes == 6 || mes == 9 || mes == 11)) {
            System.out.println("El dia siguiente a la fecha introducida es " + dia_incrementado + "/" + mes + "/" + año);
        }

        //Para el caso de los meses de 31:
        // Los meses con 31 dias son Enero, marzo, mayo, Julio, Agosto, Octubre y Diciembre, osea, los meses 1,3,5,7,8,10 y 12
        // Por tanto, mediante if le decimos que si  el dia es mayor o igual a 1 y menor o igual a 31
        // y que ademas si elegimos los meses 1 o 3 o 5 o 7 o 8 o 10 o 12, nos va a imprimir la fecha y nos dirá que es correcta

        if ((dia >= 1 && dia <= 31)&&(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)) {

            System.out.println("El dia siguiente a la fecha introducida es " + dia_incrementado + "/" + mes + "/" + año);

        }

        //Para el caso del mes con 28 dias:
        // El mes con 28 es febrero, osea, el mes 2
        // Por tanto, mediante if le decimos que si el dia es mayor o igual a 1 y menor o igual a 28
        // y que ademas si elegimos el mes 2, nos va a imprimir la fecha y nos dirá que es correcta

        if ((dia >= 1 && dia <= 28)&&mes == 2) {

            System.out.println("El dia siguiente a la fecha introducida es " + dia_incrementado + "/" + mes + "/" + año);

        }


    }

}