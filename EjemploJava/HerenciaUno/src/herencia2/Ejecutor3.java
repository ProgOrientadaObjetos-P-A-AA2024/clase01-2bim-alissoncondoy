/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;

import herencia1.*;
import java.util.Locale;
import java.util.Scanner;
import herencia1.EstudianteDistancia;

/**
 *
 * @author reroes
 */
public class Ejecutor3 {
    public static void main(String[] args) {
        // Ingresar por teclado
        // un objeto de tipo Estudiante Distancia si el usuario ingresa 1 como 
        // opción
        // un objeto de tipo Estudiante Presencial si el usuario ingresa 2 como 
        // opción
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int opcion, edad, asignaturas, creditos;
        double costoAsignatura, costoCreditos;
        String nombres, apellidos, identificacion;
        System.out.print("Ingrese nombres: ");
        nombres = entrada.nextLine();
        System.out.print("Ingrese apellidos: ");
        apellidos = entrada.nextLine();
        System.out.print("Ingrese identificación: ");
        identificacion = entrada.nextLine();
        System.out.print("Ingrese edad: ");
        edad = entrada.nextInt();
        System.out.print("Ingrese la opcion que necesite\n"
                + "1. Estudiante Distancia\n"
                + "2. Estudiante Presencial\n");
           
        opcion = entrada.nextInt();
        entrada.nextLine();
        switch (opcion) {
            case 1:

                System.out.print("Ingrese número de asignaturas: ");
                asignaturas = entrada.nextInt();
                System.out.print("Ingrese costo asignatura: $");
                costoAsignatura = entrada.nextDouble();
                EstudianteDistancia estudiante = new EstudianteDistancia();

                estudiante.establecerNombresEstudiante(nombres);
                estudiante.establecerApellidoEstudiante(apellidos);
                estudiante.establecerEdadEstudiante(edad);
                estudiante.establecerIdentificacionEstudiante(identificacion);
                estudiante.establecerNumeroAsginaturas(asignaturas);
                estudiante.establecerCostoAsignatura(costoAsignatura);
                estudiante.calcularMatriculaDistancia();
                System.out.printf("%s\n", estudiante);
                break;
            case 2:
                
                System.out.print("Ingrese número de creditos: ");
                creditos = entrada.nextInt();
                System.out.print("Ingrese costo creditos: $");
                costoCreditos = entrada.nextDouble();

                EstudiantePresencial estudiante1 = new EstudiantePresencial();

                estudiante1.establecerNombresEstudiante(nombres);
                estudiante1.establecerApellidoEstudiante(apellidos);
                estudiante1.establecerEdadEstudiante(edad);
                estudiante1.establecerIdentificacionEstudiante(identificacion);
                estudiante1.establecerNumeroCreditos(creditos);
                estudiante1.establecerCostoCredito(costoCreditos);
                estudiante1.calcularMatriculaPresencial();
                System.out.printf("%s\n", estudiante1);
                break;
            default:
                throw new AssertionError();
        }
    }
}
        
        