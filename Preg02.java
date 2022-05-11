import java.util.Scanner;

public class Preg02{
    public static void main (String args[]){
        System.out.println("Datos de entrada:N: ");
        Scanner numero = new Scanner(System.in);
        int n = numero.nextInt();
        int l = Integer.toString(n).length();
        
        System.out.println("\nDatos de salida: ");
        
        for (int i=0; i <l; i++){
            String num = String.valueOf(Integer.toString(n).charAt(i));
            System.out.println(num + "\n");
        }     
    }
}