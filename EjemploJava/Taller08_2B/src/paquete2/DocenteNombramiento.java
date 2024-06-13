/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author utpl
 */
public class DocenteNombramiento extends Docente {

    private double salarioBase;
    private int horasExtra;
    private double sueldoMensual;
    private double valorFijo;
    private double sueldoExtra;

    public void establecerSalarioBase(double n) {
        salarioBase = n;
    }

    public void establecerHorasExtra(int n) {
        horasExtra = n;
    }

    public void establecerValorFijo(double n) {
        valorFijo = n;
    }

    public void calcularSueldoExtra() {
        sueldoExtra = horasExtra * valorFijo;
    }

    public void calcularSueldoMensual() {
        sueldoMensual = sueldoExtra + salarioBase;
    }

    public double obtenerSalarioBase() {
        return salarioBase;
    }

    public double obtenerValorFijo() {
        return valorFijo;
    }

    public int obtenerHorasExtra() {
        return horasExtra;
    }

    public double obtenerSueldoMensual() {
        return sueldoMensual;
    }

    public double obtenerSueldoExtra() {
        return sueldoExtra;
    }

    @Override
    public String toString() {
        String reporte = String.format("------------------------------------------\n"
                + "Nombre: %s\n"
                + "Apellidos: %s\nIdentificacion: %s\n"
                + "Edad: %d\nNombramiento: Por Factura\n"
                + "Sueldo Base: %.2f\nHoras Extra: %d\n"
                + "Valor por Hora: %.2f\nSueldo Extra: %.2f\n"
                + "Sueldo total: %.2f\n"
                + "------------------------------------------\n",
                obtenerNombres(),
                obtenerApellidos(),
                obtenerIdentificacion(),
                obtenerEdad(),
                salarioBase,
                horasExtra,
                valorFijo, sueldoExtra,
                sueldoMensual);

        return reporte;
    }
}
