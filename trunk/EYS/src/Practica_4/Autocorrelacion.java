package Practica_4;

import Practica_1.GeneradorMZRAN;
import java.util.ArrayList;

public class Autocorrelacion {

    private ArrayList<Double> listaDeNumeros;
    private double i;
    private double m;
    private double cantidadDeNumeros;
    private double numerosTotalesGenerados;
    private int M;

    /*public static void main(String[] args) {
     GeneradorMZRAN generador = new GeneradorMZRAN();
     Autocorrelacion test = new Autocorrelacion(3, 5, 10000);
     test.setListaDeNumeros(generador.mzranAutoCorrelacion(test.getI(), test.getm(), test.getCantidadDeNumeros()));
     test.calcularZ0();
     }*/
    public Autocorrelacion(double i, double m, double cantidadDeNumeros) {
        this.i = i;
        this.m = m;
        this.cantidadDeNumeros = cantidadDeNumeros;
        this.listaDeNumeros = new ArrayList<>();
    }

    public void setListaDeNumeros(ArrayList<Double> listaDeNumeros) {
        this.listaDeNumeros = listaDeNumeros;
    }

    public double getI() {
        return i;
    }

    public double getm() {
        return m;
    }

    public double getCantidadDeNumeros() {
        return cantidadDeNumeros;
    }

    private void calcularM() {
        numerosTotalesGenerados = listaDeNumeros.get(listaDeNumeros.size() - 1);
        System.out.println("Numeros Totales Generados: " + numerosTotalesGenerados);
        System.out.println(((numerosTotalesGenerados - (1 * m) - i) / m));
        M = (int) ((numerosTotalesGenerados - (1 * m) - i) / m);
        System.out.println("M: " + M);
    }

    private double calcularRaizVarianza() {
        double raizVarianza;
        double dividendo = Math.sqrt((13 * M) + 7);
        double divisor = 12 * (M + 1);
        raizVarianza = dividendo / divisor;
        System.out.println("Raiz: " + raizVarianza);
        return raizVarianza;
    }

    private double calcularEstimador() {
        calcularM();
        double estimador;
        double primerTermino = (1 / (M + 1));
        double sumatorio = 0;
        for (int contador = 0; contador < M; contador++) {
            sumatorio = sumatorio + (listaDeNumeros.get(contador) * listaDeNumeros.get(contador + 1));
        }
        estimador = (primerTermino * sumatorio) - 0.25;
        System.out.println("Estimador: " + estimador);
        return estimador;
    }

    public void calcularZ0() {
        double estimador = calcularEstimador();
        double raizVarianza = calcularRaizVarianza();
        double Z0 = estimador / raizVarianza;
        System.out.println("Z0: " + Z0);
    }
}
