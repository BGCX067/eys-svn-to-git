package VariablesAleatorias;

import Practica_1.GeneradorMZRAN;
import java.util.ArrayList;

public class TransformadaInversaEmpirica {

    private int muestras;
    private int intervalos;
    private ArrayList<Double> numerosAleatorios = new ArrayList<>();
    private GeneradorMZRAN generador = new GeneradorMZRAN();
    private double[][] datosDistribucion;
    private double[] cantidadIntervalos;

    /*public static void main(String[] args) {
     TransformadaInversaEmpirica distribucion = new TransformadaInversaEmpirica(10, 7);
     distribucion.rellenarTablarEjemplo();
     distribucion.calcularDistribucionEmpirica();
     }*/
    public TransformadaInversaEmpirica(int muestras, int intervalos) {
        this.muestras = muestras;
        this.intervalos = intervalos;
        //InvertaloMenor;IntervaloMayor;Frecuencia;FrecuenciaRelativa;FrecuenciaAcumulada
        this.datosDistribucion = new double[intervalos][5];
    }

    public double[][] getDatosDistribucion() {
        return datosDistribucion;
    }

    public void setDatosDistribucion(double[][] datosDistribucion) {
        this.datosDistribucion = datosDistribucion;
    }

    public double[] getCantidadIntervalos() {
        return cantidadIntervalos;
    }

    public void setCantidadIntervalos(double[] cantidadIntervalos) {
        this.cantidadIntervalos = cantidadIntervalos;
    }

    /*public void rellenarTablarEjemplo() {
     double[][] alumnosfxniveleidioma = {{15, 30, 10, 0, 0},
     {30, 45, 20, 0, 0},
     {45, 60, 25, 0, 0},
     {60, 90, 35, 0, 0},
     {90, 120, 30, 0, 0},
     {120, 180, 20, 0, 0},
     {180, 300, 10, 0, 0}};
     this.datosDistribucion = alumnosfxniveleidioma;
     }*/
    public void calcularFrecuenciasRelativas() {
        double sumaFrecuencias = calcularSumaFrecuenciasDatos();
        for (int i = 0; i < datosDistribucion.length; i++) {
            datosDistribucion[i][3] = datosDistribucion[i][2] / sumaFrecuencias;
        }
    }

    public double calcularSumaFrecuenciasDatos() {
        double suma = 0;
        for (int i = 0; i < datosDistribucion.length; i++) {
            suma = suma + datosDistribucion[i][2];
        }
        return suma;
    }

    public void calcularFrecuenciasAcumuladas() {
        for (int i = 0; i < datosDistribucion.length; i++) {
            if (i == 0) {
                datosDistribucion[i][4] = datosDistribucion[i][3];
            } else {
                datosDistribucion[i][4] = datosDistribucion[i - 1][4] + datosDistribucion[i][3];
            }
        }
    }

    public int calculoIntervalo(double numeroAleatorio) {
        int intervalo = 0;
        double frecuenciaAcumuladaAnterior, frecuenciaAcumuladaActual;
        for (int i = 0; i < datosDistribucion.length; i++) {
            if (i == 0) {
                frecuenciaAcumuladaAnterior = 0;
            } else {
                frecuenciaAcumuladaAnterior = datosDistribucion[i - 1][4];
            }
            frecuenciaAcumuladaActual = datosDistribucion[i][4];
            if (frecuenciaAcumuladaAnterior <= numeroAleatorio && numeroAleatorio <= frecuenciaAcumuladaActual) {
                intervalo = i;
            }
        }
        return intervalo;
    }

    public void imprimirTablaDatos(double[][] tabla) {
        for (int i = 0; i < tabla.length; i++) {
            System.out.println("");
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] + " ");
            }
        }
        System.out.println("");
    }

    public double[] calcularDistribucionEmpirica() {
        calcularFrecuenciasRelativas();
        calcularFrecuenciasAcumuladas();
        imprimirTablaDatos(datosDistribucion);
        numerosAleatorios = generador.mzran(muestras);
        double Xi;
        int intervalo;
        double PAcumulada;
        double DiferenciaIntervalo;
        double[] vectorResultado = new double[muestras];
        cantidadIntervalos = new double[intervalos];
        for (int i = 0; i < numerosAleatorios.size(); i++) {
            intervalo = calculoIntervalo(numerosAleatorios.get(i));
            cantidadIntervalos[intervalo]++;
            if (intervalo == 0) {
                PAcumulada = 0;
            } else {
                PAcumulada = datosDistribucion[intervalo - 1][4];
            }
            DiferenciaIntervalo = datosDistribucion[intervalo][1] - datosDistribucion[intervalo][0];
            Xi = (numerosAleatorios.get(i) - PAcumulada) * (DiferenciaIntervalo / datosDistribucion[intervalo][3]) + datosDistribucion[intervalo][0];
            System.out.println("Aleatorio: " + numerosAleatorios.get(i) + " Numero: " + Xi);
            vectorResultado[i] = Xi;
        }
        return vectorResultado;
    }
}
