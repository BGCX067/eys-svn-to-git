package VariablesAleatorias;

import Practica_1.GeneradorMZRAN;
import java.util.ArrayList;

public class TransformadaInversaDiscreta {

    private ArrayList<Double> numerosAleatorios = new ArrayList<>();
    private GeneradorMZRAN generador = new GeneradorMZRAN();
    private double[][] datosDistribucion;
    private int muestras;
    private int intervalos;

    /*public static void main(String[] args) {
     TransformadaInversaDiscreta distribucion = new TransformadaInversaDiscreta(8, 3);
     distribucion.rellenarTablarEjemplo();
     distribucion.calcularFrecuenciasAcumuladas();
     distribucion.calcularDiscreta();
     }*/
    public TransformadaInversaDiscreta(int muestras, int intervalos) {
        this.muestras = muestras;
        this.intervalos = intervalos;
        //Dato;Probabilidad;Acumulada
        this.datosDistribucion = new double[intervalos][3];
    }

    public TransformadaInversaDiscreta(int muestras, double probabilidadIntervalo) {
    }

    public double[][] getDatosDistribucion() {
        return datosDistribucion;
    }

    public void setDatosDistribucion(double[][] datosDistribucion) {
        this.datosDistribucion = datosDistribucion;
    }

    private void calcularFrecuenciasAcumuladas() {
        for (int i = 0; i < datosDistribucion.length; i++) {
            if (i == 0) {
                datosDistribucion[i][2] = datosDistribucion[i][1];
            } else {
                datosDistribucion[i][2] = datosDistribucion[i - 1][2] + datosDistribucion[i][1];
            }
        }
    }

    /*private void rellenarTablarEjemplo() {
     double[][] alumnosfxniveleidioma = {{0, 0.5, 0},
     {1, 0.3, 0},
     {2, 0.2, 0}};
     this.datosDistribucion = alumnosfxniveleidioma;
     }*/
    public void imprimirTablaDatos(double[][] tabla) {
        for (int i = 0; i < tabla.length; i++) {
            System.out.println("");
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] + " ");
            }
        }
        System.out.println("");
    }

    public double[] calcularDiscreta() {
        calcularFrecuenciasAcumuladas();
        imprimirTablaDatos(datosDistribucion);
        double[] vectorResultado = new double[muestras];
        numerosAleatorios = generador.mzran(muestras);
        for (int i = 0; i < muestras; i++) {
            double Xi = recorrerArray(numerosAleatorios.get(i), datosDistribucion[intervalos - 1][2]);
            System.out.println("Xi: " + Xi);
            vectorResultado[i] = Xi;
        }
        return vectorResultado;
    }

    private double recorrerArray(double aleatorio, double frecuenciaMax) {
        double resultado = 0;
        double frecuencia;
        for (int i = 0; i < datosDistribucion.length; i++) {
            frecuencia = datosDistribucion[i][2] / frecuenciaMax;
            if (aleatorio < frecuencia) {
                resultado = datosDistribucion[i][0];
                i = datosDistribucion.length + 1;
            }
        }
        return resultado;
    }
}
