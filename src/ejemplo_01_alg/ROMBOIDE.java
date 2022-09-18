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
public class ROMBOIDE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double altura, area, base, perimetro;
        System.out.println("PROGRAMA QUE CALCULA EL AREA Y EL PERIMETRO DEL ROMBOIDE.");
        System.out.print("Ingresa el valor de altura: ");
        altura = in.nextDouble();
        in.nextLine();
        System.out.print("Ingresa el valor de base: ");
        base = in.nextDouble();
        in.nextLine();
        area=altura*base;
        perimetro=altura+base+altura+base;
        System.out.println("Valor de area: " + area);
        System.out.println("Valor de perimetro: " + perimetro);
    
}  
}
