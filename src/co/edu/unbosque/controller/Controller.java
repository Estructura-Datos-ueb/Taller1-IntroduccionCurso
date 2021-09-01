package co.edu.unbosque.controller;

import co.edu.unbosque.model.Ordenamiento;
import co.edu.unbosque.view.VistaConsola;

public class Controller {

    private VistaConsola v;
    private Ordenamiento o;
    int numerof;

    public Controller (){
        
        
        try {
        	v = new VistaConsola();
        	o = new Ordenamiento( Integer.parseInt(v.getTamano()));
		} catch (Exception e) {
			// TODO: handle exception
			System.exit(0);
		}
        v.mostrarInformacion("El tamaño de la matriz n X n es: "+Integer.parseInt(v.getTamano())+"\n" );
        int option = v.mostrarOpcion("Desea  imprimir la matriz? (puede demorarse mucho si su tamaño es muy grande)");
        if(option == 0) {
        	 mostrarMatriz();
        }
       
        
        String menu = "Bienvenido al programa de Algoritmos de Ordenamiento y Seleccion\n"
        + 	"Seleccione una opcion a Continuación"
        		+ "1. Promedio de Todos los Numeros de la matriz\n"
        		+ "2. Buscar un numero usando Busqueda Binaria\n"
        		+ "3. Verificar si un numero Existe mas de m Veces\n"
        		+ "4. Retornar un vector con los primeros n numeros impares de la matriz ordenados Ascendentemente (Burbuja)\n"
        		+ "5. Retornar un vector con todos los numeros primos en la matriz ordenados descendentemente (Seleccion)\n"
        		+ "6. Retornar un arreglo con los primeros n multiplos de x ordenados ascendentemente (Insercion)\n";
        
        try { 
        	Integer opcion = Integer.parseInt(v.leerDato(menu));
        	
        	  switch (opcion) {
      		case 1:
      			v.mostrarInformacion("Promedio de todos los numeros de la matriz: "+String.valueOf(o.calcularPromedio()));
      			break;
      		case 2:
      			try {
      				Integer n = Integer.parseInt(v.leerDato("ingrese el numero que desea buscar en la matriz"));
      				v.mostrarInformacion(o.buscarNumero(n));
				} catch (Exception e) {
					// TODO: handle exception
					v.mostrarInformacion("Error: Valor Invalido");
				}
      			
      			break;
      		case 3:
      			try {
      				Integer n = Integer.parseInt(v.leerDato("ingrese el numero que desea buscar en la matriz"));
					Integer n1 = Integer.parseInt(v.leerDato("ingrese el numero que de veces m que desea saber si esta repetido"));
      				v.mostrarInformacion(o.buscarNumeroRepetido(n,n1));
				} catch (Exception e) {
					// TODO: handle exception
					v.mostrarInformacion("Error: Valor Invalido");
				}
		
		break;
      		case 4:
      			
      			try {
      				Integer n = Integer.parseInt(v.leerDato("ingrese el numero de impares que desea encontrar"));
      				v.mostrarInformacion(o.buscarImpares(n));
				} catch (Exception e) {
					// TODO: handle exception
					v.mostrarInformacion("Error: Valor Invalido");
				}
		
		break;
      		case 5:
      			v.mostrarInformacion(o.buscarPrimos());		
		break;
      		case 6:
      			try {
					Integer n1 = Integer.parseInt(v.leerDato("Ingrese el numero al cual desee encontrarle sus multiplos"));
					Integer n2 = Integer.parseInt(v.leerDato("Ingrese el numero de multiplos a encontrar"));
					v.mostrarInformacion(o.buscarMultiplos(n1, n2));
				} catch (Exception e) {
					// TODO: handle exception
					v.mostrarInformacion("Error: Valor Invalido");
				}
      			
      			break;
      			

      		default:
      			v.mostrarInformacion("Opción Invalida");
      			break;
      		}
		} catch (Exception e) {
			// TODO: handle exception
			v.mostrarInformacion("Error: Opción Invalida");
		}
        
        
      
        
        
        

    }
    public void mostrarMatriz(){
    	String matriz = "";
        for(int i=0;i<(Integer.parseInt(v.getTamano()));i++){
            for(int j=0;j<(Integer.parseInt(v.getTamano()));j++) {
            	matriz = matriz + ((o.matriz[i][j] + ", "));
            }
            matriz = matriz +("\n");
        }
        v.mostrarInformacion(matriz);

    }

}
