/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author utpl
 */
public class DocenteFactura extends Docente {

    private int iva;
    private double descuento;
    private double valorFinal;
    private double factura;

    public void establecerFactura(double n) {
        factura = n;
    }

    public void establecerIva(int n) {
        iva = n;
    }

    public void calcularDescuento() {
        descuento = (iva * 0.01) * factura;
    }

    public void calcularValorFinal() {
        valorFinal = factura - descuento;
    }

    public double obtenerFactura() {
        return factura;
    }

    public int obtenerIva() {
        return iva;
    }

    public double obtenerDescuento() {
        return descuento;
    }

    public double obtenerValorFinal() {
        return valorFinal;
    }

    @Override
    public String toString() {
        String reporte = String.format("------------------------------------------\n"
                + "Nombre: %s\n"
                + "Apellidos: %s\nIdentificacion: %s\n"
                + "Edad: %d\nNombramiento: Por Factura\n"
                + "Valor Factura: %.2f\nValor IVA: %d\n"
                + "Valor a descontar: %.2f\nValor a pagar: %.2f\n"
                + "------------------------------------------\n",
                obtenerNombres(),
                obtenerApellidos(),
                obtenerIdentificacion(),
                obtenerEdad(),
                factura,
                iva,
                descuento,
                valorFinal);

        return reporte;
    }
}
