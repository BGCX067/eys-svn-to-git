package VariablesAleatorias;

import Practica_1.GeneradorMZRAN;
import java.util.ArrayList;

public class TransformadaInversaExponencial {

    private int muestras;
    private double media;
    private ArrayList<Double> numerosAleatorios = new ArrayList<>();
    private GeneradorMZRAN generador = new GeneradorMZRAN();

    /*public static void main(String[] args) {
     TransformadaInversaExponencial distribucion = new TransformadaInversaExponencial(10, 2.8);
     distribucion.calcularDistribuciónExponencial();
     }*/
    public TransformadaInversaExponencial(int muestras, double media) {
        this.muestras = muestras;
        this.media = media;
    }

    //Lambda = 1/media
    public double[] calcularDistribuciónExponencial() {
        numerosAleatorios = generador.mzran(muestras);
        double Xi;
        double[] vectorResultado = new double[muestras];
        System.out.println("\nCalculando Distribución Exponencial:\n");
        for (int i = 0; i < numerosAleatorios.size(); i++) {
            //Xi = (-1/lambda)*Ln(1-Ri)
            Xi = ((-1 * media) * Math.log(1 - numerosAleatorios.get(i)));
            System.out.println("NumeroAleatorio: " + numerosAleatorios.get(i) + "\tXi: " + Xi);
            vectorResultado[i] = Xi;
        }
        return vectorResultado;
    }
}
