/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_01_alg;
import java.util.Scanner;
/**
 *
 * @author MOISES OSCCO HUAROCC
 */
public class SUMA_RADIOS {
 public static void main(String[] args) {

  double rad1,rad2,rad3, resultado;
    Scanner sc = new Scanner(System.in); //Se crea el lector
    System.out.println("PROGRAMA QUE SUMA 3 RADIOS");

    System.out.println("Escribe el primer radio: ");
    rad1= sc.nextDouble(); 

    System.out.println("Escribe el segundo radio:");
    rad2 = sc.nextDouble();

    System.out.println("Escribe el tercer radio:");
    rad3 = sc.nextDouble();
   
resultado=rad1 + rad2 + rad3; // Almacenamos la suma en la variable resultado
 
System.out.println("Valor de la suma: " + resultado);
 
 }
    
}
