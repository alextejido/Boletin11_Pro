package boletin11;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

/**
 *
 * @author atejidosolla
 */
public class Tiempo {
    
  public void amosar(){  
    Instant in1= Instant.now();
        Scanner sc = new Scanner(System.in);
        String texto;
        System.out.println("Escribe la siguiente frase:");
        System.out.println("A documentación é todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicación informática .");
        System.out.println("PREMER PARA REMATAR");
        texto = sc.next();
         Instant in2 = Instant.now();
        Duration duracion= Duration.between(in1, in2);
        System.out.println("Tardaches " + duracion.getSeconds()  + " segundos en escribir la frase");
  }
}
