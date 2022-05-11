package Ejercicios;

import java.util.Scanner;

public class Eje3 {
   
    public static int invertir(int numero){
        int res=0;
        
        while (numero>0) {            
            int dig = numero%10;
            res =(res*10)+dig;
            numero = numero/10;
        }
        return res;
    }
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int num, cap;
        
        System.out.print("Digite el numero: "); num = entrada.nextInt();
        
        cap = invertir(num);
        
        if (cap == num) {
            
            System.out.print("\n");
            System.out.println("El numero es capicua");
        }
        else{
            System.out.print("\n");
            System.out.println("El numero no es capicua");
        }
        
    }
}