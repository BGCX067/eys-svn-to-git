package VariablesAleatorias;

import Practica_1.GeneradorMZRAN;

public class Gamma {

    private int muestras;
    private double desviacionTipica;
    private double media;
    private double beta;
    private double teta;
    private GeneradorMZRAN generador = new GeneradorMZRAN();

    /*public static void main(String[] args) {
     Gamma distribucion = new Gamma(10, 0.34, 2.0);
     distribucion.calcularGamma();
     }*/
    public Gamma(double media, double desviacionTipica, int muestras) {
        this.desviacionTipica = desviacionTipica;
        this.media = media;
        this.muestras = muestras;
        calcularTeta();
        calcularBeta();
    }

    public Gamma(int muestras, double beta, double teta) {
        this.beta = beta;
        this.teta = teta;
        this.muestras = muestras;
    }

    final void calcularTeta() {
        teta = 1 / media;
    }

    final void calcularBeta() {
        beta = 1 / (Math.pow(teta, 2) * Math.sqrt(desviacionTipica));
    }

    public double[] calcularGamma() {
        double Xi;
        double a;
        double b;
        double primerAleatorio;
        double segundoAleatorio;
        double[] vectorResultado = new double[muestras];
        a = Math.sqrt((2 * beta) - 1);
        b = (2 * beta) - Math.log(4) + (1 / a);
        int muestrasValidas = 0;
        double condicion;
        while (muestrasValidas < muestras) {
            primerAleatorio = generador.generazorMZRANDinamico();
            segundoAleatorio = generador.generazorMZRANDinamico();
            Xi = beta * (primerAleatorio / (1 - segundoAleatorio));
            condicion = (b - Math.log(Math.pow(primerAleatorio, 2) * segundoAleatorio));
            if (Xi <= condicion) {
                Xi = Xi / (beta * teta);
                System.out.println("Xi: " + Xi);
                vectorResultado[muestrasValidas] = Xi;
                muestrasValidas++;
            }
        }
        return vectorResultado;
    }
}
