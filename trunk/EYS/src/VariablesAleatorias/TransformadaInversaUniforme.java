package VariablesAleatorias;

import Practica_1.GeneradorMZRAN;
import java.util.ArrayList;

public class TransformadaInversaUniforme {

    private int muestras;
    private double inicioDistribucion;
    private double finDistribucion;
    private ArrayList<Double> numerosAleatorios = new ArrayList<>();
    private GeneradorMZRAN generador = new GeneradorMZRAN();

    /*public static void main(String[] args) {
     TransformadaInversaUniforme distribucion = new TransformadaInversaUniforme(1, 3, 10);
     distribucion.calcularDistribucionUniforme();
     }*/
    //a = inicioDistribucion; b = finDistribucion
    public TransformadaInversaUniforme(double inicioDistribucion, double finDistribucion, int muestras) {
        this.inicioDistribucion = inicioDistribucion;
        this.finDistribucion = finDistribucion;
        this.muestras = muestras;
    }

    public double[] calcularDistribucionUniforme() {
        numerosAleatorios = generador.mzran(muestras);
        double Xi;
        double[] vectorResultado = new double[muestras];
        System.out.println("\nCalculando Distribución Uniforme:\n");
        for (int i = 0; i < numerosAleatorios.size(); i++) {
            Xi = (numerosAleatorios.get(i) * (finDistribucion - inicioDistribucion)) + inicioDistribucion;
            System.out.println("NumeroAleatorio: " + numerosAleatorios.get(i) + "\tXi: " + Xi);
            vectorResultado[i] = Xi;
        }
        return vectorResultado;
    }
}
