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
public class PROMEDIO {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, nota_1, nota_2, nota_3, nota_4;
        int nota_5, promedio;
        for (i=1; i<=5; i++) {
            System.out.println("PROGRAMA QUE CALCULA EL PROMEDIO DE 5 NOTAS.");   
            System.out.print("Ingresa el valor de nota 1: ");
            nota_1 = in.nextInt();
            in.nextLine();
            System.out.print("Ingresa el valor de nota 2: ");
            nota_2 = in.nextInt();
            in.nextLine();
            System.out.print("Ingresa el valor de nota 3: ");
            nota_3 = in.nextInt();
            in.nextLine();
            System.out.print("Ingresa el valor de nota 4: ");
            nota_4 = in.nextInt();
            in.nextLine();
            System.out.print("Ingresa el valor de nota 5: ");
            nota_5 = in.nextInt();
            in.nextLine();
            promedio=(nota_1+nota_2+nota_3+nota_4+nota_5)/5;

            System.out.println("Valor de promedio: " + promedio);
            System.out.println();
        }
    }
    
}
