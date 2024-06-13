/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Locale;
import java.util.Scanner;
import paquete2.*;

/**
 *
 * @author reroes
 */
public class Ejecutor1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int op;

        System.out.println("Ingresar docente por Nombramiento    [1]");
        System.out.println("Ingresar docente por Factura         [2]");
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

                System.out.printf("%s\n", docente);
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

                System.out.printf("%s\n", docente2);
                break;

            }
            default: {
                System.out.println("Error opcion no valida");
            }
        }

    }
}
