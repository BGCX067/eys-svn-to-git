package Practica_4;

import Practica_1.GeneradorMZRAN;
import java.util.HashMap;
import java.util.Map;

public class LongitudRachasAscendentesDescendentes {

    private HashMap<Double, Double> rachas;
    private double cantidadDeNumeros = 0;
    private double cantidadDeRachas = 0;
    private double rachaMasLarga = 0;
    private double EYiAcumulado = 0;

    /*public static void main(String[] args) {
     GeneradorMZRAN generador = new GeneradorMZRAN();
     LongitudRachasAscendentesDescendentes test = new LongitudRachasAscendentesDescendentes(generador.mzranLongitudYCantidadRachasAscendentesYDescendentes());
     test.calcularX0();
     }*/
    public LongitudRachasAscendentesDescendentes(HashMap<Double, Double> rachas) {
        this.rachas = rachas;
    }

    private void calcularCantidadDeNumerosYRachas() {
        System.out.println("Longitud HashMap: " + rachas.size());
        for (Map.Entry e : rachas.entrySet()) {
            cantidadDeNumeros = cantidadDeNumeros + ((double) e.getKey() * (double) e.getValue());
            cantidadDeRachas = cantidadDeRachas + (double) e.getValue();
            if ((double) e.getKey() > rachaMasLarga) {
                rachaMasLarga = (double) e.getKey();
            }
        }
        System.out.println("Cantidad de Números: " + cantidadDeNumeros);
        System.out.println("Cantidad de Rachas: " + cantidadDeRachas);
        System.out.println("Racha más larga: " + rachaMasLarga);
    }

    private double calcularEi(double i) {
        double Ei;
        if (i < (cantidadDeNumeros - 1)) {
            double primerTermino = (2 / factorial(i + 3));
            double primerTerminoParentesis = (i * i) + (3 * i) + 1;
            double segundoTerminoParentesis = ((i * i * i) + (3 * (i * i)) - i - 4);
            Ei = primerTermino * ((cantidadDeNumeros * primerTerminoParentesis) - segundoTerminoParentesis);
        } else {
            Ei = 2 / factorial(cantidadDeNumeros);
        }
        System.out.println("Ei: " + Ei);
        EYiAcumulado = EYiAcumulado + Ei;
        return Ei;
    }

    private double calcularMedia() {
        double media = ((2 * cantidadDeNumeros) - 1) / 3;
        System.out.println("Media: " + media);
        return media;
    }

    private double calcularXOResto() {
        double X0Resto;
        System.out.println("EYiAcumulado: " + EYiAcumulado);
        double EiResto = calcularMedia() - EYiAcumulado;
        X0Resto = Math.pow(EiResto, 2) / EiResto;
        System.out.println("X0Resto: " + X0Resto);
        return X0Resto;
    }

    public void calcularX0() {
        System.out.println("Calculando X0...");
        calcularCantidadDeNumerosYRachas();
        double Ei;
        double X0 = 0;
        double Li;
        double X0Temporal;
        for (double i = 1; i <= rachaMasLarga; i++) {
            if (rachas.containsKey(i)) {
                Li = rachas.get(i);
            } else {
                Li = 0;
            }
            Ei = calcularEi(i);
            X0Temporal = ((Li - Ei) * (Li - Ei)) / Ei;
            X0 = X0 + X0Temporal;
        }
        System.out.println("X0 Hasta el momento: " + X0);
        X0 = X0 + calcularXOResto();
        System.out.println("X0: " + X0);
    }

    private double factorial(double numero) {
        double factorial;
        if (numero == 0) {
            factorial = 1;
        } else {
            factorial = numero * factorial(numero - 1);
        }
        return factorial;
    }
}
