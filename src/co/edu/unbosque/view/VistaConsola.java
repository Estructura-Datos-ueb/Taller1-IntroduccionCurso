package co.edu.unbosque.view;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class VistaConsola {

    private String tamano;

    public VistaConsola() {
        tamano =  JOptionPane.showInputDialog("Porfavor ingrese el tamaño de la matriz");
    }
    public void ingresarinformacion(String mensaje){
        tamano =  JOptionPane.showInputDialog(mensaje);
    }

    public void mostrarInformacion( String mensaje) {
        System.out.print(mensaje);
    }

    public String leerDato(String mensaje) {
        mostrarInformacion(mensaje);
        //int n = leer.nextInt();
        return tamano;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }





}
