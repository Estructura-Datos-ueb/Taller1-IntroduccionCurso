package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.Random;

public class Ordenamiento {

    public int [][] matriz;
    private int  tamano;

    public Ordenamiento (int tamano) {
        this.tamano= tamano;
        matriz = new int[tamano][tamano];

        llenarMatriz();
    }

    public  void llenarMatriz() {
        for(int i=0;i<tamano;i++) {
            for(int j=0;j<tamano;j++) {
                Random r = new Random();
                double numeroM= r.nextInt(10);
                matriz[i][j] = (int) numeroM;
            }
        }
    }
//Metodo para calcular el promedio de la matriz
    public String calcularPromedio(){
        String mensaje = "";
        return mensaje;
    }
//Metodo para calcular el promedio de la matriz
    public String buscarNumero(int numeroIngresado) {
        String mensaje = "El numero no se encuentra en la matriz";
        int contador=0;
        for(int i=0;i<=(tamano-1);i++) {
            for(int j=0;j<=(tamano-1);j++) {
                if(matriz[i][j]==numeroIngresado) {
                    mensaje="El numero "+numeroIngresado+" se encuentra en la matriz";
                    contador=1;
                    break;
                }
            }
            if(contador==1){
                break;
            }
        }
        return mensaje;
    }
//Metodo para calcular el promedio de la matriz
    public String buscarNumeroRepetido(int numeroIngresado) {
        String mensaje = "El numero no se encuentra repetido en la matriz";
        int contador=0;
        for(int i=0;i<=(tamano-1);i++) {
            for(int j=0;j<=(tamano-1);j++) {
                if(matriz[i][j]==numeroIngresado) {
                    contador++;
                }
            }
            if(contador>=1){
                mensaje="El numero "+numeroIngresado+" se encuentra repetido "+contador+" en la matriz";
            }
        }
        return mensaje;
    }
//Metodo que retorna un vector con las numeros primos de manera desendente(hace suo de algoritmo de seleccion)
    public String darNumerosPrimos(){
        String mensaje = "";
        return mensaje;
    }
//Metodo qeu retorna le numeros multiplos de un numero x de manera ascendente(hace uso del algoritmo de insercion)
////////////getter-setter/////////////////

    public int[][] getMatriz() {
        return matriz;
    }
    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

}

