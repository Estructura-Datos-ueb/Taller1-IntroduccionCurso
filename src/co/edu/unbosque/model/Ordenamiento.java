package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.Random;

public class Ordenamiento {

    public int [][] matriz;
    private int  tamano;

    public Ordenamiento (int tamano) {
        this.tamano= tamano;
        matriz = new int[tamano][tamano];

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
    public String buscarNumeroRepetido(int numeroIngresado) {
        String mensaje = "El numero no se encuentra repetido en la matriz";
        int contador=0;
        for(int i=0;i<=(tamano-1);i++) {
            for(int j=0;j<=(tamano-1);j++) {
                if(matriz[i][j]==numeroIngresado) {
                    contador++;
                }
            }
            if(contador>=1){
                mensaje="El numero "+numeroIngresado+" se encuentra repetido "+contador+" en la matriz";
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
                if (primo){
                    primos.add(matriz[i][j]);
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

    public String  buscarMultiplos(int n , int x){
        int contador = 1;
        String resultado = "Multiplos Encontrados: \n";
        ArrayList<Integer> lista = new ArrayList<>();
        while (contador != x){
            lista.add(n * contador);
            contador++;

        }

        lista = ordenamientoInsercion(lista);

        for (int i = 0; i < lista.size() ; i++) {
            resultado = resultado + lista.get(i)+ ", ";
        }
        
        
        
        return resultado;
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
        // se localiza el punto de inserción explorando hacia abajo
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

