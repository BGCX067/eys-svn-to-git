package Practica_2;

import Practica_1.GeneradorMZRAN;
import java.util.ArrayList;
import java.util.Collections;

public class Kolmogorov_Smirnov {

    public ArrayList<Double> listaDeNumeros;
    public double[] D;
    public double Dmas;
    public double Dmenos;
    public double D010;
    public double D005;
    public double D001;

    /*public static void main(String[] args) {
     Kolmogorov_Smirnov ks = new Kolmogorov_Smirnov();
     ks.pruebaK_S(20000000);
     }*/
    public Kolmogorov_Smirnov() {
        D = new double[2];
        D[0] = -1;
        D[1] = -1;
        D010 = 0;
        D005 = 0;
        D001 = 0;
        Dmas = 0;
        Dmenos = 0;
        listaDeNumeros = new ArrayList<>();
    }

    public void pruebaK_S(int ciclosMax) {
        GeneradorMZRAN generador = new GeneradorMZRAN();
        System.out.println("Obteniendo números aleatorios: ");
        listaDeNumeros = generador.mzran(ciclosMax);
        System.out.println("Ordenando lista de números aleatorios...");
        Collections.sort(listaDeNumeros);
        System.out.println("Lista ordenada =D");

        double ciclosRealizados = listaDeNumeros.size();

        double raizDelPeriodo = Math.sqrt(ciclosRealizados);
        D010 = (1.22 / raizDelPeriodo);
        System.out.println("D010: " + D010);
        D005 = (1.36 / raizDelPeriodo);
        System.out.println("D005: " + D005);
        D001 = (1.63 / raizDelPeriodo);
        System.out.println("D001: " + D001);
        int ciclos;
        double numeroAleatorio;
        double cicloActual;
        for (ciclos = 1; ciclos <= ciclosRealizados; ciclos++) {
            cicloActual = ciclos;
            numeroAleatorio = listaDeNumeros.get(ciclos - 1);
            //Kolmogorov-Smirnov:
            Dmas = (((cicloActual) / ciclosRealizados) - numeroAleatorio);
            if (D[0] < Dmas) {
                D[0] = Dmas;
            }
            Dmenos = numeroAleatorio - ((cicloActual - 1) / ciclosRealizados);
            if (D[1] < Dmenos) {
                D[1] = Dmenos;
            }
            //Fin Kolmogorov-Smirnov
        }

        if (D[0] > D[1]) {
            System.out.println("Dmas es mayor que Dmenos: " + D[0] + " > " + D[1]);
            if ((D[0] < D010) && (D[0] < D005) && (D[0] < D001)) {
                System.out.println("D[0] es menor que el valor crítico de K_S por lo que no podemos rechazar la hipótesis nula");
            }
        } else {
            System.out.println("Dmenos es mayor que Dmas: " + D[1] + " > " + D[0]);
            if ((D[1] < D010) && (D[1] < D005) && (D[1] < D001)) {
                System.out.println("D[1] es menor que el valor crítico de K_S por lo que no podemos rechazar la hipótesis nula");
            }
        }
    }
}
