package co.edu.unbosque.controller;

import java.util.Scanner;
import java.util.Scanner;

public class OrdenamientoInsercion {

    public static void main(String[] args) {

        int ArrayN[] = new int[10];
        String ArrayNom[] = new String[10];
/*
			ArrayN[0] = 4;
			ArrayN[1] = 8;
			ArrayN[2] = 7;
			ArrayN[3] = 6;
			ArrayN[4] = 5;
			ArrayN[5] = 9;
			ArrayN[6] = 3;
			ArrayN[7] = 2;
			ArrayN[8] = 1;
			ArrayN[9] = 0;
*/

        ArrayNom[0] = "b";
        ArrayNom[1] = "f";
        ArrayNom[2] = "h";
        ArrayNom[3] = "a";
        ArrayNom[4] = "c";
        ArrayNom[5] = "d";
        ArrayNom[6] = "e";
        ArrayNom[7] = "g";
        ArrayNom[8] = "h";
        ArrayNom[9] = "i";



        for(int i=0;i<=9;i++) {
            ArrayN[i]=ArrayNom[i].codePointAt(0);
        }


        System.out.println("      -SIN ORDENAR-");
        mostrarNom(ArrayNom);

        System.out.println("       -ORDENADO-   ");
        ordenaInsercion(ArrayN, ArrayNom);

        System.out.println("       -Invertido-   ");
        ordenaInsercionInverso(ArrayN, ArrayNom);

    }

    static void ordenaInsercion(int ArrayN[],String ArrayNom[]) {
        String campol;
        int campo, c, p = ArrayN.length;
        for (int j=1; j<p; j++) {
            campo = ArrayN[j];
            campol =  ArrayNom[j];
            c = j-1;
            while (c>-1 && ArrayN[c]>campo) {
                ArrayN[c+1] = ArrayN[c];
                ArrayNom[c+1] = ArrayNom[c];
                c = c-1;
            }
            ArrayN[c+1] = campo;
            ArrayNom[c+1] = campol;
        }

        mostrarNom(ArrayNom);
    }

    static void ordenaInsercionInverso(int ArrayN[],String ArrayNom[]) {
        String campol;
        int campo, c, p = ArrayN.length;
        for (int j=1; j<p; j++) {
            campo = ArrayN[j];
            campol =  ArrayNom[j];
            c = j-1;
            while (c>-1 && ArrayN[c]<campo) {
                ArrayN[c+1] = ArrayN[c];
                ArrayNom[c+1] = ArrayNom[c];
                c = c-1;
            }
            ArrayN[c+1] = campo;
            ArrayNom[c+1] = campol;
        }

        mostrarNom(ArrayNom);
    }


    static void mostrarNum(int ArrayN[]) {

        for (int i = 0; i < ArrayN.length; i++) {
            System.out.print(" Elemento " + (i + 1) + " -----> " + ArrayN[i] + "\n");
        }

    }
    static void mostrarNom(String ArrayNom[]) {

        for (int i = 0; i < ArrayNom.length; i++) {
            System.out.print(" Elemento " + (i + 1) + " -----> " + ArrayNom[i] + "\n");
        }

    }


}

