package Ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Eje4 {
    
    ArrayList<Integer> listaDivisores;
    
    public ArrayList obtenerDivisores(int num){
        
        for (int i = 1; i <= num; i++) {
            if (num%i==0) {
                listaDivisores.add(i);
            }
        }        
        return listaDivisores;
    }
    
    public void mostrarLista(){
        if (!listaDivisores.isEmpty()) {
            for (int i = 0; i < listaDivisores.size(); i++) {
                System.out.print(listaDivisores.get(i)+" ");
            }
        }
    }
    
    public int sumaLista(){
        
        int suma = 0;
        
        if (!listaDivisores.isEmpty()) {
            for (int i = 0; i < (listaDivisores.size()-1); i++) {
                suma = suma + listaDivisores.get(i);
            }
        }
        
        return suma;
    }
    
    public static void main(String[] args) {
        
        Eje4 miLista = new Eje4();
        miLista.listaDivisores = new ArrayList();
        int perfecto;
        
        Scanner entrada = new Scanner(System.in);
        
        int numero;
        
        System.out.print("Ingrese el número: "); numero = entrada.nextInt();
        
        //Divisores
        miLista.obtenerDivisores(numero);
        
        //Mostrar Divisores
        miLista.mostrarLista();
        
        perfecto = miLista.sumaLista();
        
        System.out.println("\nSuma: "+perfecto); 
        
        if (perfecto==numero) {
            System.out.println("El número es perfecto");
        }
        else{
            System.out.println("El número no es perfecto");
        }
        
    }
}