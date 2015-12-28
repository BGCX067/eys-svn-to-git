package Practica_4;

import Practica_1.GeneradorMZRAN;
import java.util.HashMap;
import java.util.Map;

public class LongitudRachasEncimaDebajoMedia {

    private HashMap<Double, Double> rachas;
    private double cantidadDeNumeros = 0;
    private double cantidadDeNumerosEncimaMedia = 0;
    private double cantidadDeNumerosDebajoMedia = 0;
    private double cantidadDeRachas = 0;
    private double rachaMasLarga = 0;
    private double WiAcumulado = 0;
    private double Ei = 0;

    /*public static void main(String[] args) {
     GeneradorMZRAN generador = new GeneradorMZRAN();
     LongitudRachasEncimaDebajoMedia test = new LongitudRachasEncimaDebajoMedia(generador.mzranLongitudYCantidadRachasEncimaYDebajoMedia());
     test.calcularX0();
     }*/
    public LongitudRachasEncimaDebajoMedia(HashMap<Double, Double> rachas) {
        this.rachas = rachas;
    }

    private void calcularCantidadDeNumerosYRachas() {
        System.out.println("Longitud HashMap: " + rachas.size());
        for (Map.Entry e : rachas.entrySet()) {
            if ((double) e.getKey() >= 0) {
                cantidadDeNumeros = cantidadDeNumeros + ((double) e.getKey() * (double) e.getValue());
                cantidadDeRachas = cantidadDeRachas + (double) e.getValue();
                if ((double) e.getKey() > rachaMasLarga) {
                    rachaMasLarga = (double) e.getKey();
                }
            }
        }
        cantidadDeNumerosEncimaMedia = rachas.get((double) -1);
        cantidadDeNumerosDebajoMedia = rachas.get((double) -2);
        System.out.println("Cantidad de Números: " + cantidadDeNumeros);
        System.out.println("Cantidad de Números Encima de la Media: " + cantidadDeNumerosEncimaMedia);
        System.out.println("Cantidad de Números Debajo de la Media: " + cantidadDeNumerosDebajoMedia);
        System.out.println("Cantidad de Rachas: " + cantidadDeRachas);
        System.out.println("Racha más larga: " + rachaMasLarga);
    }

    private double calcularWi(double i) {
        double Wi;
        double N1EntreN = cantidadDeNumerosEncimaMedia / cantidadDeNumeros;
        double N2EntreN = cantidadDeNumerosDebajoMedia / cantidadDeNumeros;
        double primerTermino = Math.pow(N1EntreN, i) * N2EntreN;
        double segundoTermino = N1EntreN * Math.pow(N2EntreN, i);
        Wi = primerTermino + segundoTermino;
        WiAcumulado = WiAcumulado + Wi;
        return Wi;
    }

    private void calcularEi() {
        Ei = (cantidadDeNumerosEncimaMedia / cantidadDeNumerosDebajoMedia) + (cantidadDeNumerosDebajoMedia / cantidadDeNumerosEncimaMedia);
        System.out.println("Ei: " + Ei);
    }

    private double calcularEYi(double i) {
        double EYi;
        EYi = (cantidadDeNumeros * calcularWi(i)) / Ei;
        return EYi;
    }

    private double calcularX0Temporal(double Li, double EYi) {
        double X0Temporal;
        double dividendo = Math.pow((Li - EYi), 2);
        X0Temporal = dividendo / EYi;
        System.out.println("XOTemporal: " + X0Temporal);
        return X0Temporal;
    }

    private double calcularX0Resto() {
        double X0Resto;
        double Wi = 1 - WiAcumulado;
        double EYi = (cantidadDeNumeros * Wi) / Ei;
        X0Resto = Math.pow(EYi, 2) / EYi;
        return X0Resto;
    }

    public void calcularX0() {
        System.out.println("Calculando X0...");
        calcularCantidadDeNumerosYRachas();
        calcularEi();
        double Li;
        double EYi;
        double X0 = 0;
        for (double i = 1; i <= rachaMasLarga; i++) {
            if (rachas.containsKey(i)) {
                Li = rachas.get(i);
            } else {
                Li = 0;
            }
            EYi = calcularEYi(i);
            X0 = X0 + calcularX0Temporal(Li, EYi);
        }
        X0 = X0 + calcularX0Resto();
        System.out.println("X0: " + X0);
    }
}
