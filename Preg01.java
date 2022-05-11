
import java.util.Scanner;

public class Preg01 {
    public static void main(String[] args) {
       
        Scanner teclado=new Scanner(System.in);
        System.out.println("Digite un numero:");
        double num=teclado.nextDouble();
        double sumatoria=0.25-(1/(num+4));
        System.out.println("La sumatoria es igual a: " + sumatoria);
         
    }
}
