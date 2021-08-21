package co.edu.unbosque.controller;

import co.edu.unbosque.model.Ordenamiento;
import co.edu.unbosque.view.VistaConsola;

public class Controller {

    private VistaConsola v;
    private Ordenamiento o;
    int numerof;

    public Controller (){
        v = new VistaConsola();
        System.out.println(Integer.parseInt(v.getTamano()));
        o = new Ordenamiento( Integer.parseInt(v.getTamano()));
        mostrarVista();
    }

    public void mostrarVista(){
        for(int i=0;i<(Integer.parseInt(v.getTamano()));i++){
            for(int j=0;j<(Integer.parseInt(v.getTamano()));j++){
                v.mostrarInformacion(o.matriz[i][j]+", ");
            }
            System.out.println("\n");
        }
    }
}
