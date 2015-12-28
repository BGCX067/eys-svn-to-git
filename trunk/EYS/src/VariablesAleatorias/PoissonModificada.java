package VariablesAleatorias;

import Practica_1.GeneradorMZRAN;

public class PoissonModificada {

    private GeneradorMZRAN generador = new GeneradorMZRAN();
    private double alpha;
    private int muestras;

    /*public static void main(String[] args) {
     PoissonModificada distribucion = new PoissonModificada(0.2, 1000);
     distribucion.calcularPoisson();
     }*/
    public PoissonModificada(double alpha, int muestras) {
        this.alpha = alpha;
        this.muestras = muestras;
    }

    public double[] calcularPoisson() {
        double numeroE = Math.pow(Math.E, -alpha);
        System.out.println("e^(-alpha): " + numeroE);
        double p = 1;
        int n = 0;
        //double pActual;
        int muestrasValidas = 0;
        int ciclos = 0;
        System.out.println("Muestras: " + muestras);
        double[] vectorResultado = new double[muestras];
        while (muestrasValidas < muestras) {
            for (int i = 0; i < (n + 1); i++) {
                double aleatorio = generador.generazorMZRANDinamico();
                p = p * aleatorio;
                if (p < numeroE) {
                    if (muestrasValidas < muestras) {
                        vectorResultado[muestrasValidas] = n;
                        System.out.println("N: " + n);
                        n = 0;
                        p = 1;
                        //vectorResultado[muestrasValidas] = aleatorio;                   
                        muestrasValidas++;
                    } else {
                        i = n + 1;
                    }
                } else {
                    n = n + 1;
                }
                ciclos++;
            }
        }
        System.out.println("Ciclos necesarios: " + ciclos);
        return vectorResultado;
    }
}
