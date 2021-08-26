package co.edu.unbosque.view;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class VistaConsola {

    private String tamano;

    public VistaConsola() {
        tamano =  JOptionPane.showInputDialog("Porfavor ingrese el tama�o de la matriz");
    }
    public void ingresarinformacion(String mensaje){
        tamano =  JOptionPane.showInputDialog(mensaje);
    }

    public void mostrarInformacion( String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public String leerDato(String mensaje) {
    	String opcion = "";
        opcion = JOptionPane.showInputDialog(mensaje);

        return opcion;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }





}
