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
public class EJEMPLO_01_03_ALG {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
           suma();
    }
    
     public static void suma(){
        Scanner teclado = new Scanner(System.in);
        
        int num1,num2,num3,num4,num5,sumar;
        System.out.println(" PROGRAMA QUE SUMA DE 5 NUMEROS:"); 
        System.out.println("Ingrese el primer numero:");
        num1= teclado.nextInt();
        System.out.println("Ingrese el segundo numero:");
        num2= teclado.nextInt();
        System.out.println("Ingrese el tercer numero:");
        num3= teclado.nextInt();
        System.out.println("Ingrese el cuarto numero:");
        num4= teclado.nextInt();
        System.out.println("Ingrese el quinto numero:");
        num5= teclado.nextInt();
        
        sumar=num1+num2+num3+num4+num5;
        
        System.out.println("La sumatoria es:" +sumar);
        
    }
}
