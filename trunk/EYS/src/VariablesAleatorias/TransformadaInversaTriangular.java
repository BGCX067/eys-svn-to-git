package VariablesAleatorias;

import Practica_1.GeneradorMZRAN;
import java.util.ArrayList;

public class TransformadaInversaTriangular {

    private int muestras;
    private double inicio;
    private double fin;
    private double altura;
    private ArrayList<Double> numerosAleatorios = new ArrayList<>();
    private GeneradorMZRAN generador = new GeneradorMZRAN();

    /*public static void main(String[] args) {
     TransformadaInversaTriangular distribucion = new TransformadaInversaTriangular(0, 2, 10);
     distribucion.calcularDistribuciónTriangular();
     }*/
    public TransformadaInversaTriangular(double inicio, double fin, int muestras) {
        this.inicio = inicio;
        this.fin = fin;
        this.muestras = muestras;
        altura = 0;
    }

    public TransformadaInversaTriangular(double inicio, double centro, double fin, int muestras) {
        this.inicio = inicio;
        this.altura = centro;
        this.fin = fin;
        this.muestras = muestras;
    }

    public double[] calcularDistribuciónTriangular() {
        numerosAleatorios = generador.mzran(muestras);
        double Xi;
        double[] vectorResultado = new double[muestras];
        if (altura == 0) {
            //altura = 2 / (fin - inicio);
            altura = (fin + inicio) / 2;
        }
        System.out.println("\nCalculando Distribución Triangular:\n");
        double condicion = ((altura - inicio) / (fin - inicio));
        for (int i = 0; i < numerosAleatorios.size(); i++) {
            if (numerosAleatorios.get(i) <= condicion) {
                Xi = (inicio + Math.sqrt((fin - inicio) * (altura - inicio) * numerosAleatorios.get(i)));
            } else {
                Xi = (fin - Math.sqrt((fin - inicio) * (fin - altura) * (1 - numerosAleatorios.get(i))));
            }
            System.out.println("NumeroAleatorio: " + numerosAleatorios.get(i) + "\tXi: " + Xi);
            vectorResultado[i] = Xi;
        }
        return vectorResultado;
    }
}