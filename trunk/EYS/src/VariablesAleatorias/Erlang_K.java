package VariablesAleatorias;

import Practica_1.GeneradorMZRAN;

public class Erlang_K {

    private int kEtapas;
    private double media;
    private int muestras;
    private double lambda;
    GeneradorMZRAN generador = new GeneradorMZRAN();

    /*public static void main(String[] args) {
     Erlang_K distribucion = new Erlang_K(4, 2, 4);
     distribucion.calcularDistribucionErlangK();
     }*/
    public Erlang_K(int kEtapas, double media, int muestras) {
        this.kEtapas = kEtapas;
        this.media = media;
        this.lambda = this.kEtapas * this.media;
        this.muestras = muestras;
    }

    public Erlang_K(double lambda, int muestras, int kEtapas) {
        this.lambda = lambda;
        this.muestras = muestras;
        this.kEtapas = kEtapas;
    }

    public double[] calcularDistribucionErlangK() {
        double Xi;
        double[] vectorResultado = new double[muestras];
        for (int i = 0; i < muestras; i++) {
            Xi = (-1 * (lambda)) * calcularSumatorioLogaritmosAleatorios();
            System.out.println("Xi: " + Xi);
            vectorResultado[i] = Xi;
        }
        return vectorResultado;
    }

    private double calcularSumatorioLogaritmosAleatorios() {
        double sumatorioAleatorios = 0;
        double unoMenosAleatorio;
        for (int i = 0; i < kEtapas - 1; i++) {
            unoMenosAleatorio = (1 - generador.generazorMZRANDinamico());
            sumatorioAleatorios = sumatorioAleatorios + Math.log(unoMenosAleatorio);
        }
        System.out.println("SumatorioAleatorios: " + sumatorioAleatorios);
        return sumatorioAleatorios;
    }
}
