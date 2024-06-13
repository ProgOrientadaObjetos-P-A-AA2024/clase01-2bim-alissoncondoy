/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import java.util.Locale;
import java.util.Scanner;
import paquete2.*;

/**
 *
 * @author utpl
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int op;
        boolean bandera = true;
        String cadena = "Reporte de docentes con nombramiento\n";
        String cadena2 = "Reporte de docentes con factura\n";
        do {
            System.out.println("Ingresar docente por Nombramiento    [1]");
            System.out.println("Ingresar Docente por Factura         [2]");
            op = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Ingrese nombres: ");
            String nombres = entrada.nextLine();
            System.out.println("Ingrese apellidos: ");
            String apellidos = entrada.nextLine();
            System.out.println("Ingrese identificación: ");
            String identificacion = entrada.nextLine();
            System.out.println("Ingrese edad: ");
            int edad = entrada.nextInt();
            switch (op) {
                case 1: {
                    DocenteNombramiento docente = new DocenteNombramiento();
                    System.out.println("Ingrese sueldo base: ");
                    double sueldob = entrada.nextDouble();
                    System.out.println("Ingrese horas extra: ");
                    int extra = entrada.nextInt();
                    System.out.println("Ingrese valor por hora: ");
                    double valor = entrada.nextDouble();
                    docente.establecerNombres(nombres);
                    docente.establecerApellidos(apellidos);
                    docente.establecerEdad(edad);
                    docente.establecerIdentificacion(identificacion);
                    docente.establecerSalarioBase(sueldob);
                    docente.establecerHorasExtra(extra);
                    docente.establecerValorFijo(valor);
                    docente.calcularSueldoExtra();
                    docente.calcularSueldoMensual();

                    cadena = String.format("%s%s", cadena, docente);
                    break;
                }
                case 2: {
                    DocenteFactura docente2 = new DocenteFactura();
                    System.out.println("Ingrese sueldo por factura: ");
                    double sueldof = entrada.nextDouble();
                    System.out.println("Ingrese iva: ");
                    int iva = entrada.nextInt();
                    docente2.establecerNombres(nombres);
                    docente2.establecerApellidos(apellidos);
                    docente2.establecerEdad(edad);
                    docente2.establecerIdentificacion(identificacion);
                    docente2.establecerFactura(sueldof);
                    docente2.establecerIva(iva);
                    docente2.calcularDescuento();
                    docente2.calcularValorFinal();

                    cadena2 = String.format("%s%s", cadena2, docente2);
                    break;

                }

                default: {
                    System.out.println("Error opcion no valida");
                }
            }
            entrada.nextLine();
            System.out.println("Si desea dejar de ingresar datos digite n: ");
            String opc = entrada.nextLine();
            if (opc.equals("n")) {
                bandera = false;
                System.out.printf("%s", cadena);
                System.out.printf("%s", cadena2);
            }
        } while (bandera);

    }
}
