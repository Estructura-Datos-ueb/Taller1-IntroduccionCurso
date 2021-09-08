package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.Random;

public class Ordenamiento {

    public int [][] matriz;
    private int  tamano;

    public Ordenamiento () {
        this.tamano= tamano;
    }

    public  void llenarMatriz() {
        matriz = new int[tamano][tamano];
        for(int i=0;i<tamano;i++) {
            for(int j=0;j<tamano;j++) {
                Random r = new Random();
                double numeroM= r.nextInt(17);
                matriz[i][j] = (int) numeroM;
            }
        }
    }
//Metodo para calcular el promedio de la matriz
    public Integer calcularPromedio(){
      Integer resultado = 0;
      
      for (int i = 0; i < matriz.length; i++) {
		for (int j = 0; j < matriz.length; j++) {
			resultado = resultado + matriz[i][j];
		}
	}
      resultado = resultado / (matriz.length * matriz.length);
      
      return resultado;
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
    public String buscarNumeroRepetido(int numeroIngresado, int numeroM) {
        String mensaje = "El numero "+numeroIngresado+" no se encuentra repetido  "+numeroM+" veces  en la matriz";
        int contador=0;
        for(int i=0;i<=(tamano-1);i++) {
            for(int j=0;j<=(tamano-1);j++) {
                if(matriz[i][j]==numeroIngresado) {
                    contador++;
                }
            }
            if(contador==numeroM){
                mensaje="El numero "+numeroIngresado+" si encuentra repetido "+numeroM+" veces en la matriz";
            }
        }
        return mensaje;
    }
//Metodo que retorna un vector con las numeros primos de manera desendente(hace suo de algoritmo de seleccion)
    public String buscarPrimos(){
        boolean primo = false;
        ArrayList<Integer> primos = new ArrayList<>();

        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                for (int k = 2; k < matriz[i][j] ; k++) {
                    if(matriz[i][j] % k == 0) {
                        primo = false;
                        k = matriz[i][j];
                    }else {
                        primo = true;
                    }
                }
                if(matriz[i][j]!=1){
                    if(matriz[i][j]!=0){
                        if (primo){
                            primos.add(matriz[i][j]);
                        }
                    }

                }

            }
        }
        ordenamientoSeleccion(primos);
        String resultado = "Numeros Primos Encontrados: \n";
        for (int i = 0; i < primos.size(); i++) {
            resultado = resultado  + primos.get(i)+ ", ";
        }
        return resultado;
    }

    public String buscarMultiplos(int n , int x){
        int aux = 0;
        int contador1 = 0;
        int valor= 0;
        String resultado = "Multiplos Encontrados: \n";
        ArrayList<Integer> lista = new ArrayList<>();
        for(int i=0;i<=(tamano-1);i++) {
            for (int j = 0; j <= (tamano - 1); j++) {
                valor = matriz[i][j];
                if(valor%n==0){
                    if(valor!=0){
                        if(valor!=1){
                            lista.add(valor);
                            contador1++;
                        }
                    }
                }
            }
        }
        ordenamientoInsercion(lista);
        String Valores = "";
        try{
            for (int a = 0 ; a < x; a++) {
                int Valor1 = lista.get(a);
                Valores = Valores + "\n" + Valor1;
                aux++;
            }
        }catch (Exception e){
            Valores = "Solo hay "+aux+" numeros multiplos de "+n+"\n" +Valores ;
            return  Valores;
        }
        return "\nLos numeros impares encontrados son: \n" + Valores;

    }
    
    public String buscarImpares(int numeroIngresado){

    	int contador = 0;
    	int aux=0;
        ArrayList<Integer> impares = new ArrayList<Integer>();
        int [] Impares ;
        Integer Valor= 0;
        
        for(int i=0;i<=(tamano-1);i++) {
            for(int j=0;j<=(tamano-1);j++) {
            	 Valor = matriz[i][j];
            	if(Valor%2!=0 ) {
                    impares.add(Valor);

            	}
            }
        }
        Impares=new int[impares.size()];
        for(int v=0;v<impares.size();v++){
            Impares[v]=impares.get(v);
        }
        algoritmoBurbuja(Impares);
		String Valores = "";
        try{
            for (int a = 0 ; a < numeroIngresado; a++) {
                int Valor1 = Impares[a];
                Valores = Valores + "\n" + Valor1;
                aux++;
            }
        } catch (Exception e) {
            Valores = "Solo hay "+aux+" numeros impares"+"\n" +Valores ;
            return  Valores;
        }

        return "\nLos numeros impares encontrados son: \n" + Valores;
    }

	public static void algoritmoBurbuja(int[] arreglo) {
        for (int x = 0; x < arreglo.length; x++) {
            // Aquí "y" se detiene antes de llegar
            // a length - 1 porque dentro del for, accedemos
            // al siguiente elemento con el índice actual + 1
            for (int y = 0; y < arreglo.length - 1; y++) {
                int elementoActual = arreglo[y],
                        elementoSiguiente = arreglo[y + 1];
                if (elementoActual > elementoSiguiente) {
                    // Intercambiar
                    arreglo[y] = elementoSiguiente;
                    arreglo[y + 1] = elementoActual;
                }
            }
        }
	}

    public ArrayList<Integer> ordenamientoInsercion(ArrayList<Integer> numeros){

        ArrayList<Integer> lista = new ArrayList<>();
        int i, j;
        int aux;
        for (i = 1; i < numeros.size(); i++)
        {
        /* indice j es para explorar la sublista a[i-1]..a[0] buscando la
        posicion correcta del elemento destino*/
                    j = i;
                    aux = numeros.get(i);
        // se localiza el punto de inserci�n explorando hacia abajo
                    while (j > 0 && aux < numeros.get(j-1))
                    {
        // desplazar elementos hacia arriba para hacer espacio
                        numeros.set(j, numeros.get(j-1));
                        j--;
                    }
            numeros.set(j, aux);
                }


        return numeros;
    }

    public ArrayList<Integer> ordenamientoSeleccion(ArrayList<Integer> primos){

        int index, i, j, n;
        n = primos.size();
        for (i = 0; i < n-1; i++)
        {
            index = i;
            for (j = i+1; j < n; j++)
                if (primos.get(j) > primos.get(index))
                    index = j;
            if (i != index)
                intercambiarNumeros(primos, i, index);
        }
        return primos;
    }

    public static void intercambiarNumeros(ArrayList<Integer> a, int i, int j)
    {
        int aux = a.get(i);
        a.set(i, a.get(j));
        a.set(j, aux);
    }
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

