package co.edu.unbosque.controller;

import co.edu.unbosque.model.Ordenamiento;
import co.edu.unbosque.view.VistaConsola;

public class Controller {

    private VistaConsola v;
    private Ordenamiento o;
    int numerof;

    public Controller (){
        v = new VistaConsola();
        o = new Ordenamiento( Integer.parseInt(v.getTamano()));
        v.mostrarInformacion("El tamaño de la matriz n X n es: "+Integer.parseInt(v.getTamano()));
        mostrarMatriz();
        o.buscarNumero(1);

    }

    public void mostrarMatriz(){
        for(int i=0;i<(Integer.parseInt(v.getTamano()));i++){
            for(int j=0;j<(Integer.parseInt(v.getTamano()));j++){
                v.mostrarInformacion(o.matriz[i][j]+", ");
            }
            System.out.println("\n");
        }
    }

}
