package Practica_2;

import Practica_1.GeneradorMZRAN;

public class Chi_Cuadrado {

    public int gradosDeLibertad;
    public double[] listaDeNumerosContados;

    /*public static void main(String[] args) {
     GeneradorMZRAN mzRAN = new GeneradorMZRAN();
     Chi_Cuadrado prueba = new Chi_Cuadrado(mzRAN.mzranConContador(30));
     prueba.pruebaChiCuadrado();
     }*/
    public Chi_Cuadrado(double[] listaDeNumerosSumados) {
        this.listaDeNumerosContados = new double[listaDeNumerosSumados.length];
        this.listaDeNumerosContados = listaDeNumerosSumados;
    }

    public void pruebaChiCuadrado() {
        double ei = calcularEi();
        double[] xi = new double[listaDeNumerosContados.length];
        double x0;
        for (int i = 0; i < xi.length; i++) {
            xi[i] = (Math.pow((listaDeNumerosContados[i] - ei), 2) / (ei));
            System.out.println("Xi de cada intervalo: " + xi[i]);
        }
        x0 = calcularX0Final(xi);
        System.out.println("X0 final: " + x0);
    }

    private double calcularEi() {
        double sumatorio = 0;
        double ei;
        //En este bucle calculo la cantidad de elementos totales:
        for (int i = 0; i < listaDeNumerosContados.length; i++) {
            sumatorio = sumatorio + listaDeNumerosContados[i];
            System.out.println("Números en el intervalo[" + i + "]: " + listaDeNumerosContados[i]);
        }
        System.out.println("Números totales: " + sumatorio);
        //El número de clases viene dado por la longitud del array:
        ei = sumatorio / listaDeNumerosContados.length;
        System.out.println("Ei = " + ei);
        return ei;
    }

    private double calcularX0Final(double[] xi) {
        double resultado = 0;
        for (int i = 0; i < xi.length; i++) {
            resultado = resultado + xi[i];
            System.out.println("Resultado = " + resultado);
        }
        return resultado;
    }
}
