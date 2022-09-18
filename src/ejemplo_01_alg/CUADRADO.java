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
public class CUADRADO {
    public static void main(String[] args) {
        Scanner ingreso=new Scanner(System.in);  
        double A=0, P=0, L;
        System.out.println("PROGRAMA QUE CALCULA EL AREA Y EL PERIMETRO DEL CUADRADO.");
        System.out.print("INGRESE LADO  : ");
        L = Double.parseDouble(ingreso.next());        
        A = L * L;
        System.out.println("");
        System.out.println("AREA          : " + A);        
        P = 4 * L;
        System.out.println("PERIMETRO     : " + P);
    }      
    
}
