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
public class TRAPECIO {
    public static void main(String[] args) {
        Scanner ingreso=new Scanner(System.in);  
        double P, A, B, Bb, h, L, M, N,O;
        System.out.println("PROGRAMA QUE CALCULA EL AREA Y PERIMETRO DEL TRAPECIO.");       
        System.out.print("INGRESE BASE MAYOR   : ");
        B = Double.parseDouble(ingreso.next());
        System.out.print("INGRESE BASE MENOR   : ");
        Bb = Double.parseDouble(ingreso.next());
        System.out.print("INGRESE ALTURA       : ");
        h = Double.parseDouble(ingreso.next());        
        A = ((B * Bb) * h) / 2;
        System.out.println("AREA                 : " + A );
        System.out.println("");  
        System.out.print("INGRESE LADO 01      : ");
        L= Double.parseDouble(ingreso.next());
        System.out.print("INGRESE LADO 02      : ");
        M= Double.parseDouble(ingreso.next());
        System.out.print("INGRESE LADO 03      : ");
        N= Double.parseDouble(ingreso.next());
        System.out.print("INGRESE LADO 04      : ");
        O= Double.parseDouble(ingreso.next());
        P = L+M+N+O;
        System.out.println("PERIMETRO            : " + P  );
    }        
}
