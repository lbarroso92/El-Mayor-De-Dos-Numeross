/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elmayordedosnumeros;
import java.util.Scanner;

public class ElMayorDeDosNumeros {

    
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Proporciona el número 1: ");
        int Número1 = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el Número 2: ");
        int Número2 = Integer.parseInt(consola.nextLine());
        System.out.println("El Mayor es : ");
        System.out.println(Número1>Número2 ? Número1 : Número2);
    }
    
}
