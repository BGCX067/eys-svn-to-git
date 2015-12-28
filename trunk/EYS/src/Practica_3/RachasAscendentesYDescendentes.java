package Practica_3;

import Practica_1.GeneradorMZRAN;

public class RachasAscendentesYDescendentes {

    private double N; //Cantidad de números
    private double rachas; //Cantidad de rachas
    private double media;
    private double varianza;
    private double Z0;

    /*public static void main(String[] args) {
     //GeneradorMZRAN generador = new GeneradorMZRAN();
     GeneradorMZRAN generador = new GeneradorMZRAN(31, 71365, 10000019, 2, 32);
     RachasAscendentesYDescendentes rachas = new RachasAscendentesYDescendentes(generador.periodoDelGenerador(), generador.mzranContadorRachasAscendentesYDescendentes());
     rachas.calcularZO();
     }*/
    public RachasAscendentesYDescendentes(double N, double rachas) {
        this.N = N;
        System.out.println("Cantidad de Números: " + this.N);
        this.rachas = rachas;
        System.out.println("Cantidad de Rachas: " + this.rachas);
    }

    private void calcularMedia() {
        double N2 = (2 * N);
        double N2Menos1 = (N2 - 1);
        media = (N2Menos1 / 3);
        System.out.println("Media: " + media);
    }

    private void calcularVarianza() {
        double N16 = (16 * N);
        double N16Menos29 = (N16 - 29);
        varianza = (N16Menos29 / 90);
        System.out.println("Varianza: " + varianza);
    }

    private void calcularZO() {
        calcularMedia();
        calcularVarianza();
        double rachasMenosMedia = (rachas - media);
        Z0 = (rachasMenosMedia / Math.sqrt(varianza));
        System.out.println("Resultado: " + Z0);
    }
}
