package co.edu.unbosque.controller;

import co.edu.unbosque.model.Ordenamiento;
import co.edu.unbosque.view.VistaConsola;

public class Controller {

    private VistaConsola v;
    private Ordenamiento o;
    int numerof;
    int exit;

    public Controller () {
		v = new VistaConsola();
		o = new Ordenamiento();
		createMatriz();
    	star();

	}

	public boolean createMatriz(){
		boolean aux=false;
    	try{
    		v.ingresarinformacion("Porfavor ingrese el tamano de la matriz");
			o.setTamano(Integer.parseInt(v.getTamano()));
    		o.llenarMatriz();
			v.mostrarInformacion("El tamano de la matriz n X n es: "+Integer.parseInt(v.getTamano())+"\n" );
			int option = v.mostrarOpcion("Desea  imprimir la matriz? (puede demorarse mucho si su tamano es muy grande)");
			if(option == 0) {
				mostrarMatriz();
				mostrarMatrizConsola();
				aux=true;
			}
		}catch (Exception  e){
    		v.mostrarInformacion("Porfavor  ingrese la infomacion correctamente");
    		createMatriz();
		}
		return aux;
	}

    public void star(){
		exit=0;
        String menu = "Bienvenido al programa de Algoritmos de Ordenamiento y Seleccion\n"
        		+"Seleccione una opcion a Continuacion\n"
        		+ "1. Promedio de Todos los Numeros de la matriz\n"
        		+ "2. Buscar un numero usando Busqueda Binaria\n"
        		+ "3. Verificar si un numero Existe mas de m Veces\n"
        		+ "4. Retornar un vector con los primeros n numeros impares de la matriz ordenados Ascendentemente (Burbuja)\n"
        		+ "5. Retornar un vector con todos los numeros primos en la matriz ordenados descendentemente (Seleccion)\n"
        		+ "6. Retornar un arreglo con los primeros n multiplos de x ordenados ascendentemente (Insercion)\n"
				+ "7. Para listar la matriz\n"
				+ "8. Para salir del programa\n";
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
					star();
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
					star();
				}
      			break;

      		case 4:
      			
      			try {
      				Integer n = Integer.parseInt(v.leerDato("ingrese el numero de impares que desea encontrar"));
      				v.mostrarInformacion(o.buscarImpares(n));
				} catch (Exception e) {
					// TODO: handle exception
					v.mostrarInformacion("Error: Valor Invalido");
					star();
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
					star();
				}
      			break;
      		case 7:
      			mostrarMatriz();
      			break;

			case 8:
				exit=1;
				break;

      		default:
      			v.mostrarInformacion("Opcion Invalida");
				star();
      			break;

      		}
		} catch (Exception e) {
			// TODO: handle exception
			v.mostrarInformacion("Error: Opcion Invalida");
		}
		exitStart();
    }
    public void exitStart(){
    	if(exit!=1){
    		star();
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
	public void mostrarMatrizConsola(){
		String matriz = "";
		for(int i=0;i<(Integer.parseInt(v.getTamano()));i++){
			for(int j=0;j<(Integer.parseInt(v.getTamano()));j++) {
				matriz = matriz + ((o.matriz[i][j] + ", "));
			}
			matriz = matriz +("\n");
		}
		v.mostrarInformacionConsole(matriz);
	}

}
