package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.Random;

public class Ordenamiento {

    public int [][] matriz;
    private int  tamano;

    public Ordenamiento (int tamano) {
        matriz = new int[tamano][tamano];
        this.tamano= tamano;
        llenarMatriz();
    }

    public  void llenarMatriz() {
        for(int i=0;i<tamano;i++) {
            for(int j=0;j<tamano;j++) {
                Random r = new Random();
                double numeroM= r.nextInt(10000);
                matriz[i][j] = (int) numeroM;
            }
        }
    }

    public String buscarNumero(int numeroIngresado) {
        String mensaje = null;
        for(int i=0;i<(tamano-1);i++) {
            for(int j=0;j<(tamano-1);j++) {
                if(matriz[i][j]==numeroIngresado) {
                    mensaje="El numero "+numeroIngresado+" se encuentra en la matriz";
                    break;
                }else {
                    mensaje="El numero no se encuentra en la matriz";
                }
            }
        }
        return mensaje;
    }
    public String buscarNumeroRepetido(int numeroIngresado) {
        String mensaje = null;
        int contador = 0;
        for(int i=0;i<tamano;i++) {
            for(int j=0;i<tamano;j++) {
                if(matriz[i][j]==numeroIngresado) {
                    contador++;
                    mensaje="El numero "+numeroIngresado+" se encuentra "+contador+" veces en la matriz";
                }else {
                    mensaje="El numero no se encuentra en la matriz";
                }
            }
        }
        return mensaje;
    }

////////////getter-setter/////////////////7

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

