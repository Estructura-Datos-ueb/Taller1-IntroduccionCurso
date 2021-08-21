package co.edu.unbosque.controller;

import co.edu.unbosque.model.Ordenamiento;
import co.edu.unbosque.view.VistaConsola;

public class Controller {

    private VistaConsola v;
    private Ordenamiento o;
    int numerof;

    public Controller (){
        v = new VistaConsola();
        System.out.print(Integer.parseInt(v.getTamano()));
        o = new Ordenamiento( Integer.parseInt(v.getTamano()));
        //v.leerDato(o.buscarNumero());
    }

}
