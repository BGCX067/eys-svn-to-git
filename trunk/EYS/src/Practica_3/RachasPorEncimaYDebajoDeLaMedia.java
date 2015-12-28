package Practica_3;

import Practica_1.GeneradorMZRAN;

public class RachasPorEncimaYDebajoDeLaMedia {

    private double N; //Cantidad de números
    private double numerosEncimaMedia;
    private double numerosDebajoMedia;
    private double rachas;
    private double media;
    private double varianza;
    private double ZO;

    /*public static void main(String[] args) {
     //GeneradorMZRAN generador = new GeneradorMZRAN();
     GeneradorMZRAN generador = new GeneradorMZRAN(31, 71365, 10000019, 2, 32);
     double[] datos = generador.mzranContadorRachasEncimaYDebajoMedia();
     RachasPorEncimaYDebajoDeLaMedia rachas = new RachasPorEncimaYDebajoDeLaMedia(datos[1], datos[2], datos[0]);
     rachas.calcularZO();
     }*/
    public RachasPorEncimaYDebajoDeLaMedia(double numerosEncimaMedia, double numerosDebajoMedia, double rachas) {
        this.numerosEncimaMedia = numerosEncimaMedia;
        System.out.println("Numeros Encima Media: " + this.numerosEncimaMedia);
        this.numerosDebajoMedia = numerosDebajoMedia;
        System.out.println("Numeros Debajo Media: " + this.numerosDebajoMedia);
        N = this.numerosEncimaMedia + this.numerosDebajoMedia;
        System.out.println("Total de Numeros: " + N);
        this.rachas = rachas;
        System.out.println("Numero de Rachas: " + this.rachas);
    }

    private void calcularMedia() {
        media = ((2 * numerosEncimaMedia * numerosDebajoMedia) / N) + (1 / 2);
        System.out.println("Media: " + media);
    }

    private void calcularVarianza() {
        double dividendo = (2 * numerosEncimaMedia * numerosDebajoMedia) * ((2 * numerosEncimaMedia * numerosDebajoMedia) - N);
        double divisor = (N * N) * (N - 1);
        varianza = dividendo / divisor;
        System.out.println("Varianza: " + varianza);
    }

    private void calcularZO() {
        calcularMedia();
        calcularVarianza();
        ZO = ((rachas - media) / Math.sqrt(varianza));
        System.out.println("ZO: " + ZO);
    }
}
