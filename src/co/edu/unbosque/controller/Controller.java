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
        v.mostrarInformacion("El tamaño de la matriz n X n es: "+Integer.parseInt(v.getTamano())+"\n");
        mostrarMatriz();
        v.ingresarinformacion("ingrese el numero que desea buscar en la matriz");
        v.mostrarInformacion(o.buscarNumero(Integer.parseInt(v.getTamano())));
        v.ingresarinformacion("ingrese el numero  que desee saber si se encuentra repetido");
        v.mostrarInformacion("\n"+o.buscarNumeroRepetido(Integer.parseInt(v.getTamano())));
    }
    public void mostrarMatriz(){
        for(int i=0;i<(Integer.parseInt(v.getTamano()));i++){
            for(int j=0;j<(Integer.parseInt(v.getTamano()));j++) {
                v.mostrarInformacion(o.matriz[i][j] + ", ");
            }
            System.out.println("\n");
        }

    }

}
