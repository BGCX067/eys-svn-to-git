package VariablesAleatorias;

import Practica_1.GeneradorMZRAN;

public class Normal {

    private int muestras;
    private GeneradorMZRAN generador = new GeneradorMZRAN();

    /*public static void main(String[] args) {
     Normal distribucion = new Normal(4);
     distribucion.calcularNormal_Gauss();
     distribucion.calcularNormal_Schemeiser();
     }*/
    public Normal(int muestras) {
        this.muestras = muestras;
    }

    public double[] calcularNormal_Gauss() {
        double primerAleatorio;
        double segundoAleatorio;
        int muestrasValidas = 0;
        double Z1;
        double Z2;
        double B;
        double[] vectorResultado = new double[muestras];
        while (muestrasValidas < muestras) {
            primerAleatorio = generador.generazorMZRANDinamico();
            segundoAleatorio = generador.generazorMZRANDinamico();
            B = Math.sqrt(-2 * Math.log(primerAleatorio));
            Z1 = B * Math.cos(2 * Math.PI * segundoAleatorio);
            vectorResultado[muestrasValidas] = Z1;
            muestrasValidas++;
            Z2 = B * Math.sin(2 * Math.PI * segundoAleatorio);
            vectorResultado[muestrasValidas] = Z2;
            muestrasValidas++;
            System.out.println("Z1: " + Z1);
            System.out.println("Z2: " + Z2);
        }
        return vectorResultado;
    }

    public double[] calcularNormal_Schemeiser() {
        double numeroAleatorio;
        int muestrasValidas = 0;
        double Xi;
        double[] vectorResultado = new double[muestras];
        while (muestrasValidas < muestras) {
            numeroAleatorio = generador.generazorMZRANDinamico();
            if (0.0013499 <= numeroAleatorio && numeroAleatorio <= 0.9986501) {
                Xi = (Math.pow(numeroAleatorio, 0.135) - Math.pow((1 - numeroAleatorio), 0.135)) / (0.1975);
                System.out.println("Xi: " + Xi);
                vectorResultado[muestrasValidas] = Xi;
                muestrasValidas++;
            }
        }
        return vectorResultado;
    }
}
