package VariablesAleatorias;

import Practica_1.GeneradorMZRAN;
import java.util.ArrayList;

public class TransformadaInversaGeometrica {

    private double probabilidad;
    private int muestras;
    private ArrayList<Double> numerosAleatorios = new ArrayList<>();
    private GeneradorMZRAN generador = new GeneradorMZRAN();

    /*public static void main(String[] args) {
     TransformadaInversaGeometrica distribucion = new TransformadaInversaGeometrica(0.97, 20);
     distribucion.calcularDistribucionGeometrica();
     }*/
    public TransformadaInversaGeometrica(double probabilidad, int muestras) {
        this.probabilidad = probabilidad;
        this.muestras = muestras;
    }

    public double[] calcularDistribucionGeometrica() {
        numerosAleatorios = generador.mzran(muestras);
        double Xi;
        double[] vectorResultado = new double[muestras];
        for (int i = 0; i < numerosAleatorios.size(); i++) {
            Xi = (Math.log(1 - numerosAleatorios.get(i)) / Math.log(1 - probabilidad));
            System.out.println("Numero Aleatorio: " + numerosAleatorios.get(i) + " Numero: " + Xi);
            vectorResultado[i] = Xi;
        }
        return vectorResultado;
    }
}
