/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package explicacionpractica;

import java.util.Scanner;

/**
 *
 * @author caste
 */
public class ExplicacionPractica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        boolean menu = true;
        do {
            System.out.println("---Menu---");
            System.out.println("1. Ingresare radio del circulo");
            System.out.println("presione [2] para salir");
            int opc = entrada.nextInt();

            switch (opc) {
                case 1: {
                    System.out.println("");
                    System.out.print("Ingresar radio de un circulo: ");
                    float rad = entrada.nextInt();
                    //Crear un objeto circulo
                    Circulo circulo = new Circulo(rad);// se le pon el requisito del objeto
                    //muestra de informacion
                    System.out.println("Circulo 1:");
                    System.out.println("Radio: " + circulo.getRadio());
                    System.out.println("Area: " + circulo.calcularArea());
                    System.out.println("Perimetro: " + circulo.calcularPerimetro());
                    System.out.println("");
                    break;
                }
                case 2:{
                    System.out.println("Saliendo del programa...");
                    menu = false;
                    break;
                }
            }

        } while (menu);
    }
}
