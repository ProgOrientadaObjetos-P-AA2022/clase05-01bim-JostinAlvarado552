/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

public class UnidadDVD {

    private String marca;
    private double costo;

    public UnidadDVD(String a) {
        marca = a;
    }

    public UnidadDVD(String a, double n) {
        marca = a;
        costo = n;
    }

    public void establecerCosto(double n) {
        costo = n;
    }

    public double obtenerCosto() {
        return costo;
    }

    public void establecerMarca(String a) {
        marca = a;
    }

    public String obtenerMarca() {
        return marca;
    }
}
