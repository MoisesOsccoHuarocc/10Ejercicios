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
public class TRIANGULO {   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double lado1, lado2, lado3,B,H, area, perimetro;
    System.out.println("PROGRAMA QUE CALCULA EL AREA Y EL PERIMETRO DEL TRIANGULO.");
    System.out.println("Escribe el primer lado del triangulo:");
    lado1 = sc.nextDouble();
    System.out.println("Escribe el segundo lado del triangulo:");
    lado2 = sc.nextDouble();
    System.out.println("Escribe el tercer lado del triangulo:");
    lado3 = sc.nextDouble();
    System.out.println("");
    System.out.println("Escribe la base del triangulo:");
    B= sc.nextDouble();
    System.out.println("Escribe la altura del triangulo:");
    H= sc.nextDouble();

    perimetro = lado1 + lado2 + lado3;
    area = B*H/2;

    System.out.println("EL area del triangulo es de: "+ area);
    System.out.println("Y el su perimetro es de: "+ perimetro);
  }
}


