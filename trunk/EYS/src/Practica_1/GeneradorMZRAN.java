package Practica_1;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * Generador de Números Aleatorios (parte de mzran)
 * 
 * Explicaciones:
 * 
 * 1*: Generamos una sóla vez el periodo ya que hacer llamadas continuas al 
 * método Math.pow() es muy lento. 
 * 
 * -> Duración del algoritmo con llamadas continuas: 60min. aprox.
 * -> Duración del algoritmo con una única llamada: 1min. 10s. aprox.
 * 
 * 2*: Se genera el primer número aleatorio fuera del bucle para comprobar que
 * cumple con el periodo especificado.
 * 
 * 3*: Se imprime el número de ciclos para que el algoritmo indique cada cierto
 * tiempo que no ha parado y por lo tanto sigue activo y generando números.
 * 
 */
public class GeneradorMZRAN {

    private double aleatorioDinamico;
    private int ciclos = 0;
    private double semilla;
    private double a; //Constante multiplicativa
    private double c; //Sesgo
    private double m_base; //Base del módulo
    private double m_exponente; //Exponente del módulo

    /*public static void main(String[] args) {
     GeneradorMZRAN generador = new GeneradorMZRAN(17, 69069, 1013904243, 2, 32);
     //generador.mzran();
     generador.mzran(10);
     }*/
    public GeneradorMZRAN(int semilla, int a, int c, int m_base, int m_exponente) {
        this.semilla = semilla;
        this.a = a;
        this.c = c;
        this.m_base = m_base;
        this.m_exponente = m_exponente;
    }

    public GeneradorMZRAN() {
        this.semilla = 17;
        this.a = 69069;
        this.c = 1013904243;
        this.m_base = 2;
        this.m_exponente = 32;
    }

    public double periodoDelGenerador() {
        return Math.pow(this.m_base, this.m_exponente);
    }

    public void mzran() {
        //Generamos el periodo (1*)
        double periodo = Math.pow(this.m_base, this.m_exponente);
        //Fin Generación del periodo

        //Primer Ciclo (2*)
        double x = ((this.a * this.semilla + this.c) % Math.pow(this.m_base, this.m_exponente));
        double primerAleatorio = numeroAleatorio(x, periodo);
        double ciclos = 1;
        System.out.println("Primer Aleatorio: " + primerAleatorio);
        //Fin Primer Ciclo

        double numeroAleatorio = -1;
        double xn;
        while (primerAleatorio != numeroAleatorio) {
            xn = ((this.a * x + this.c) % periodo);
            numeroAleatorio = numeroAleatorio(xn, periodo);
            x = xn;
            ciclos++;

            //Impresión del número de ciclos (3*)
            if ((ciclos % 100000000) == 0) {
                System.out.println(ciclos);
            }
            //Fin de la impresión del número de ciclos

        }
        System.out.println("Cantidad de ciclos: " + ciclos);
        System.out.println("Último Aleatorio: " + numeroAleatorio);
    }

    public ArrayList<Double> mzran(int ciclosMax) {
        ArrayList<Double> numeros = new ArrayList<>();
        //Generamos el periodo (1*)
        double periodo = Math.pow(this.m_base, this.m_exponente);
        //Fin Generación del periodo

        //Primer Ciclo (2*)
        double x = ((this.a * this.semilla + this.c) % Math.pow(this.m_base, this.m_exponente));
        double primerAleatorio = numeroAleatorio(x, periodo);
        double ciclos = 1;
        numeros.add(primerAleatorio);
        System.out.println("Primer Aleatorio: " + primerAleatorio);
        //Fin Primer Ciclo

        double numeroAleatorio = -1;
        double xn;
        while ((primerAleatorio != numeroAleatorio) && (ciclos < ciclosMax)) {
            xn = ((this.a * x + this.c) % periodo);
            numeroAleatorio = numeroAleatorio(xn, periodo);
            x = xn;
            ciclos++;
            numeros.add(numeroAleatorio);
            System.out.println(numeroAleatorio);
            //Impresión del número de ciclos (3*)
            if ((ciclos % 100000000) == 0) {
                System.out.println(ciclos);
            }
            //Fin de la impresión del número de ciclos
        }
        System.out.println("Cantidad de ciclos: " + ciclos);
        System.out.println("Último Aleatorio: " + numeroAleatorio);
        return numeros;
    }

    public double[] mzranConContador(int numeroDeClases) {
        double[] numeroDeElementos = new double[numeroDeClases];
        //Generamos el periodo (1*)
        double periodo = Math.pow(this.m_base, this.m_exponente);
        //Fin Generación del periodo

        //Primer Ciclo (2*)
        double x = ((this.a * this.semilla + this.c) % Math.pow(this.m_base, this.m_exponente));
        double primerAleatorio = numeroAleatorio(x, periodo);
        double ciclos = 1;
        int posicion;
        double posicionConDecimales;
        System.out.println("Primer Aleatorio: " + primerAleatorio);
        //Fin Primer Ciclo

        double numeroAleatorio = -1;
        double xn;
        while (primerAleatorio != numeroAleatorio) {
            xn = ((this.a * x + this.c) % periodo);
            numeroAleatorio = numeroAleatorio(xn, periodo);
            x = xn;
            ciclos++;

            //Cálculo de la posición del contador:
            posicionConDecimales = numeroAleatorio * numeroDeClases;
            posicion = (int) posicionConDecimales;
            if (((posicionConDecimales % 1) == 0) && (posicion > 0)) {
                posicion = posicion - 1;
            }
            //Fin del cálculo de la posición del contador:

            numeroDeElementos[posicion]++;

            //Impresión del número de ciclos (3*)
            if ((ciclos % 100000000) == 0) {
                System.out.println(ciclos);
            }
            //Fin de la impresión del número de ciclos

        }
        System.out.println("Cantidad de ciclos: " + ciclos);
        System.out.println("Último Aleatorio: " + numeroAleatorio);
        return numeroDeElementos;
    }

    public double mzranContadorRachasAscendentesYDescendentes() {
        double cantidadDeRachas = 0;
        boolean rachaAnteriorMayor = false;
        boolean rachaActualMayor;
        double numeroAnterior;
        //Generamos el periodo (1*)
        double periodo = Math.pow(this.m_base, this.m_exponente);
        //Fin Generación del periodo

        //Primer Ciclo (2*)
        double x = ((this.a * this.semilla + this.c) % Math.pow(this.m_base, this.m_exponente));
        double primerAleatorio = numeroAleatorio(x, periodo);
        numeroAnterior = primerAleatorio;
        double ciclos = 1;
        System.out.println("Primer Aleatorio: " + primerAleatorio);
        //Fin Primer Ciclo

        double numeroAleatorio = -1;
        double xn;
        while (primerAleatorio != numeroAleatorio) {
            xn = ((this.a * x + this.c) % periodo);
            numeroAleatorio = numeroAleatorio(xn, periodo);
            x = xn;
            ciclos++;

            if (numeroAnterior > numeroAleatorio) {
                rachaActualMayor = true;
                if (rachaActualMayor != rachaAnteriorMayor) {
                    rachaAnteriorMayor = true;
                    cantidadDeRachas++;
                }
            } else {
                rachaActualMayor = false;
                if (rachaActualMayor != rachaAnteriorMayor) {
                    rachaAnteriorMayor = false;
                    cantidadDeRachas++;
                }
            }

            //Impresión del número de ciclos (3*)
            if ((ciclos % 100000000) == 0) {
                System.out.println(ciclos);
            }
            //Fin de la impresión del número de ciclos
            numeroAnterior = numeroAleatorio;
        }
        System.out.println("Cantidad de ciclos: " + ciclos);
        System.out.println("Último Aleatorio: " + numeroAleatorio);
        return cantidadDeRachas;
    }

    public HashMap<Double, Double> mzranLongitudYCantidadRachasAscendentesYDescendentes(double cantidadNumeros) {
        HashMap<Double, Double> rachas = new HashMap<>();
        //double cantidadDeRachas = 0;
        double longitudRacha = 0;
        boolean rachaAnteriorMayor = false;
        boolean rachaActualMayor;
        double numeroAnterior;
        //Generamos el periodo (1*)
        double periodo = Math.pow(this.m_base, this.m_exponente);
        //Fin Generación del periodo

        //Primer Ciclo (2*)
        double x = ((this.a * this.semilla + this.c) % Math.pow(this.m_base, this.m_exponente));
        double primerAleatorio = numeroAleatorio(x, periodo);
        numeroAnterior = primerAleatorio;
        double ciclos = 1;
        longitudRacha++;
        System.out.println("Primer Aleatorio: " + primerAleatorio);
        //Fin Primer Ciclo

        double numeroAleatorio = -1;
        double xn;
        while (primerAleatorio != numeroAleatorio && ciclos < cantidadNumeros) {
            xn = ((this.a * x + this.c) % periodo);
            numeroAleatorio = numeroAleatorio(xn, periodo);
            x = xn;
            ciclos++;
            longitudRacha++;
            if (numeroAnterior > numeroAleatorio) {
                rachaActualMayor = true;
                if (rachaActualMayor != rachaAnteriorMayor) {
                    rachaAnteriorMayor = true;
                    //cantidadDeRachas++;
                    if (rachas.containsKey(longitudRacha)) {
                        double valor = rachas.get(longitudRacha);
                        rachas.remove(longitudRacha);
                        rachas.put(longitudRacha, (valor + 1));
                    } else {
                        double inicio = 1;
                        rachas.put(longitudRacha, inicio);
                    }
                    longitudRacha = 0;
                }
            } else {
                rachaActualMayor = false;
                if (rachaActualMayor != rachaAnteriorMayor) {
                    rachaAnteriorMayor = false;
                    //cantidadDeRachas++;
                    if (rachas.containsKey(longitudRacha)) {
                        double valor = rachas.get(longitudRacha);
                        rachas.remove(longitudRacha);
                        rachas.put(longitudRacha, (valor + 1));
                    } else {
                        double inicio = 1;
                        rachas.put(longitudRacha, inicio);
                    }
                    longitudRacha = 0;
                }
            }

            //Impresión del número de ciclos (3*)
            if ((ciclos % 100000000) == 0) {
                System.out.println(ciclos);
            }
            //Fin de la impresión del número de ciclos
            numeroAnterior = numeroAleatorio;
        }
        System.out.println("Cantidad de ciclos: " + ciclos);
        System.out.println("Último Aleatorio: " + numeroAleatorio);
        return rachas;
    }

    public HashMap<Double, Double> mzranLongitudYCantidadRachasAscendentesYDescendentes() {
        HashMap<Double, Double> rachas = new HashMap<>();
        //double cantidadDeRachas = 0;
        double longitudRacha = 0;
        boolean rachaAnteriorMayor = false;
        boolean rachaActualMayor;
        double numeroAnterior;
        //Generamos el periodo (1*)
        double periodo = Math.pow(this.m_base, this.m_exponente);
        //Fin Generación del periodo

        //Primer Ciclo (2*)
        double x = ((this.a * this.semilla + this.c) % Math.pow(this.m_base, this.m_exponente));
        double primerAleatorio = numeroAleatorio(x, periodo);
        numeroAnterior = primerAleatorio;
        double ciclos = 1;
        longitudRacha++;
        System.out.println("Primer Aleatorio: " + primerAleatorio);
        //Fin Primer Ciclo

        double numeroAleatorio = -1;
        double xn;
        while (primerAleatorio != numeroAleatorio) {
            xn = ((this.a * x + this.c) % periodo);
            numeroAleatorio = numeroAleatorio(xn, periodo);
            x = xn;
            ciclos++;
            longitudRacha++;
            if (numeroAnterior > numeroAleatorio) {
                rachaActualMayor = true;
                if (rachaActualMayor != rachaAnteriorMayor) {
                    rachaAnteriorMayor = true;
                    //cantidadDeRachas++;
                    if (rachas.containsKey(longitudRacha)) {
                        double valor = rachas.get(longitudRacha);
                        rachas.remove(longitudRacha);
                        rachas.put(longitudRacha, (valor + 1));
                    } else {
                        double inicio = 1;
                        rachas.put(longitudRacha, inicio);
                    }
                    longitudRacha = 0;
                }
            } else {
                rachaActualMayor = false;
                if (rachaActualMayor != rachaAnteriorMayor) {
                    rachaAnteriorMayor = false;
                    //cantidadDeRachas++;
                    if (rachas.containsKey(longitudRacha)) {
                        double valor = rachas.get(longitudRacha);
                        rachas.remove(longitudRacha);
                        rachas.put(longitudRacha, (valor + 1));
                    } else {
                        double inicio = 1;
                        rachas.put(longitudRacha, inicio);
                    }
                    longitudRacha = 0;
                }
            }

            //Impresión del número de ciclos (3*)
            if ((ciclos % 100000000) == 0) {
                System.out.println(ciclos);
            }
            //Fin de la impresión del número de ciclos
            numeroAnterior = numeroAleatorio;
        }
        System.out.println("Cantidad de ciclos: " + ciclos);
        System.out.println("Último Aleatorio: " + numeroAleatorio);
        return rachas;
    }

    public double[] mzranContadorRachasEncimaYDebajoMedia() {
        double[] datos = new double[3];
        double numerosEncimaMedia = 0;
        double numerosDebajoMedia = 0;
        double cantidadDeRachas = 0;
        boolean rachaAnteriorMayor = false;
        boolean rachaActualMayor;
        double numeroAnterior;

        //Generamos el periodo (1*)
        double periodo = Math.pow(this.m_base, this.m_exponente);
        //Fin Generación del periodo

        //Primer Ciclo (2*)
        double x = ((this.a * this.semilla + this.c) % Math.pow(this.m_base, this.m_exponente));
        double primerAleatorio = numeroAleatorio(x, periodo);
        numeroAnterior = primerAleatorio;
        double ciclos = 1;
        System.out.println("Primer Aleatorio: " + primerAleatorio);
        if (primerAleatorio >= 0.5) {
            numerosEncimaMedia++;
            rachaActualMayor = true;
        } else {
            numerosDebajoMedia++;
            rachaActualMayor = false;
        }
        //Fin Primer Ciclo

        double numeroAleatorio = -1;
        double xn;
        while (primerAleatorio != numeroAleatorio) {
            xn = ((this.a * x + this.c) % periodo);
            numeroAleatorio = numeroAleatorio(xn, periodo);
            x = xn;
            ciclos++;

            if (numeroAleatorio >= 0.5) {
                numerosEncimaMedia++;
            } else {
                numerosDebajoMedia++;
            }

            if (numeroAleatorio >= 0.5) {
                rachaActualMayor = true;
                if (rachaActualMayor != rachaAnteriorMayor) {
                    rachaAnteriorMayor = true;
                    cantidadDeRachas++;
                }
            } else {
                rachaActualMayor = false;
                if (rachaActualMayor != rachaAnteriorMayor) {
                    rachaAnteriorMayor = false;
                    cantidadDeRachas++;
                }
            }

            //Impresión del número de ciclos (3*)
            if ((ciclos % 100000000) == 0) {
                System.out.println(ciclos);
            }
            //Fin de la impresión del número de ciclos
            numeroAnterior = numeroAleatorio;
        }
        System.out.println("Cantidad de ciclos: " + ciclos);
        System.out.println("Último Aleatorio: " + numeroAleatorio);
        datos[0] = cantidadDeRachas;
        datos[1] = numerosEncimaMedia;
        datos[2] = numerosDebajoMedia;
        return datos;
    }

    public HashMap<Double, Double> mzranLongitudYCantidadRachasEncimaYDebajoMedia(double cantidadNumeros) {
        HashMap<Double, Double> rachas = new HashMap<>();
        double numerosEncimaMedia = 0;
        double numerosDebajoMedia = 0;
        double cantidadDeRachas = 0;
        double longitudRacha = 0;
        boolean rachaAnteriorMayor = false;
        boolean rachaActualMayor;
        double numeroAnterior;

        //Generamos el periodo (1*)
        double periodo = Math.pow(this.m_base, this.m_exponente);
        //Fin Generación del periodo

        //Primer Ciclo (2*)
        double x = ((this.a * this.semilla + this.c) % Math.pow(this.m_base, this.m_exponente));
        double primerAleatorio = numeroAleatorio(x, periodo);
        numeroAnterior = primerAleatorio;
        double ciclos = 1;
        longitudRacha++;
        System.out.println("Primer Aleatorio: " + primerAleatorio);
        if (primerAleatorio >= 0.5) {
            numerosEncimaMedia++;
            rachaActualMayor = true;
        } else {
            numerosDebajoMedia++;
            rachaActualMayor = false;
        }
        //Fin Primer Ciclo

        double numeroAleatorio = -1;
        double xn;
        while (primerAleatorio != numeroAleatorio && ciclos < cantidadNumeros) {
            xn = ((this.a * x + this.c) % periodo);
            numeroAleatorio = numeroAleatorio(xn, periodo);
            x = xn;
            ciclos++;
            longitudRacha++;

            if (numeroAleatorio >= 0.5) {
                numerosEncimaMedia++;
            } else {
                numerosDebajoMedia++;
            }

            if (numeroAleatorio >= 0.5) {
                rachaActualMayor = true;
                if (rachaActualMayor != rachaAnteriorMayor) {
                    rachaAnteriorMayor = true;
                    if (rachas.containsKey(longitudRacha)) {
                        double valor = rachas.get(longitudRacha);
                        rachas.remove(longitudRacha);
                        rachas.put(longitudRacha, (valor + 1));
                    } else {
                        double inicio = 1;
                        rachas.put(longitudRacha, inicio);
                    }
                    longitudRacha = 0;
                    //cantidadDeRachas++;
                }
            } else {
                rachaActualMayor = false;
                if (rachaActualMayor != rachaAnteriorMayor) {
                    rachaAnteriorMayor = false;
                    if (rachas.containsKey(longitudRacha)) {
                        double valor = rachas.get(longitudRacha);
                        rachas.remove(longitudRacha);
                        rachas.put(longitudRacha, (valor + 1));
                    } else {
                        double inicio = 1;
                        rachas.put(longitudRacha, inicio);
                    }
                    longitudRacha = 0;
                    //cantidadDeRachas++;
                }
            }

            //Impresión del número de ciclos (3*)
            if ((ciclos % 100000000) == 0) {
                System.out.println(ciclos);
            }
            //Fin de la impresión del número de ciclos
            numeroAnterior = numeroAleatorio;
        }
        System.out.println("Cantidad de ciclos: " + ciclos);
        System.out.println("Último Aleatorio: " + numeroAleatorio);
        rachas.put((double) -1, numerosEncimaMedia);
        rachas.put((double) -2, numerosDebajoMedia);
        return rachas;
    }

    public HashMap<Double, Double> mzranLongitudYCantidadRachasEncimaYDebajoMedia() {
        HashMap<Double, Double> rachas = new HashMap<>();
        double numerosEncimaMedia = 0;
        double numerosDebajoMedia = 0;
        double cantidadDeRachas = 0;
        double longitudRacha = 0;
        boolean rachaAnteriorMayor = false;
        boolean rachaActualMayor;
        double numeroAnterior;

        //Generamos el periodo (1*)
        double periodo = Math.pow(this.m_base, this.m_exponente);
        //Fin Generación del periodo

        //Primer Ciclo (2*)
        double x = ((this.a * this.semilla + this.c) % Math.pow(this.m_base, this.m_exponente));
        double primerAleatorio = numeroAleatorio(x, periodo);
        numeroAnterior = primerAleatorio;
        double ciclos = 1;
        longitudRacha++;
        System.out.println("Primer Aleatorio: " + primerAleatorio);
        if (primerAleatorio >= 0.5) {
            numerosEncimaMedia++;
            rachaActualMayor = true;
        } else {
            numerosDebajoMedia++;
            rachaActualMayor = false;
        }
        //Fin Primer Ciclo

        double numeroAleatorio = -1;
        double xn;
        while (primerAleatorio != numeroAleatorio) {
            xn = ((this.a * x + this.c) % periodo);
            numeroAleatorio = numeroAleatorio(xn, periodo);
            x = xn;
            ciclos++;
            longitudRacha++;

            if (numeroAleatorio >= 0.5) {
                numerosEncimaMedia++;
            } else {
                numerosDebajoMedia++;
            }

            if (numeroAleatorio >= 0.5) {
                rachaActualMayor = true;
                if (rachaActualMayor != rachaAnteriorMayor) {
                    rachaAnteriorMayor = true;
                    if (rachas.containsKey(longitudRacha)) {
                        double valor = rachas.get(longitudRacha);
                        rachas.remove(longitudRacha);
                        rachas.put(longitudRacha, (valor + 1));
                    } else {
                        double inicio = 1;
                        rachas.put(longitudRacha, inicio);
                    }
                    longitudRacha = 0;
                    //cantidadDeRachas++;
                }
            } else {
                rachaActualMayor = false;
                if (rachaActualMayor != rachaAnteriorMayor) {
                    rachaAnteriorMayor = false;
                    if (rachas.containsKey(longitudRacha)) {
                        double valor = rachas.get(longitudRacha);
                        rachas.remove(longitudRacha);
                        rachas.put(longitudRacha, (valor + 1));
                    } else {
                        double inicio = 1;
                        rachas.put(longitudRacha, inicio);
                    }
                    longitudRacha = 0;
                    //cantidadDeRachas++;
                }
            }

            //Impresión del número de ciclos (3*)
            if ((ciclos % 100000000) == 0) {
                System.out.println(ciclos);
            }
            //Fin de la impresión del número de ciclos
            numeroAnterior = numeroAleatorio;
        }
        System.out.println("Cantidad de ciclos: " + ciclos);
        System.out.println("Último Aleatorio: " + numeroAleatorio);
        rachas.put((double) -1, numerosEncimaMedia);
        rachas.put((double) -2, numerosDebajoMedia);
        return rachas;
    }

    //i = numero inicial
    //m = espaciado
    public ArrayList<Double> mzranAutoCorrelacion(double i, double m, double cantidadDeNumeros) {
        ArrayList<Double> numeros = new ArrayList<>();
        double ciclosARealizar = i + (m * cantidadDeNumeros);
        System.out.println("Ciclos a Realizar: " + ciclosARealizar);
        //Generamos el periodo (1*)
        double periodo = Math.pow(this.m_base, this.m_exponente);
        //Fin Generación del periodo

        //Primer Ciclo (2*)
        double x = ((this.a * this.semilla + this.c) % Math.pow(this.m_base, this.m_exponente));
        double primerAleatorio = numeroAleatorio(x, periodo);
        double ciclos = 1;
        if ((ciclos == i) || ((ciclos - i) % m == 0)) {
            numeros.add(primerAleatorio);
        }
        System.out.println("Primer Aleatorio: " + primerAleatorio);
        //Fin Primer Ciclo

        double numeroAleatorio = -1;
        double xn;
        while (primerAleatorio != numeroAleatorio && ciclos < ciclosARealizar) {
            xn = ((this.a * x + this.c) % periodo);
            numeroAleatorio = numeroAleatorio(xn, periodo);
            x = xn;
            ciclos++;

            if ((ciclos == i) || ((ciclos - i) % m == 0)) {
                numeros.add(numeroAleatorio);
            }

            //Impresión del número de ciclos (3*)
            if ((ciclos % 100000000) == 0) {
                System.out.println(ciclos);
            }
            //Fin de la impresión del número de ciclos
        }
        numeros.add(ciclos);
        System.out.println("Cantidad de ciclos: " + ciclos);
        System.out.println("Último Aleatorio: " + numeroAleatorio);
        return numeros;
    }

    public double generazorMZRANDinamico() {
        //Generamos el periodo (1*)
        double periodo = Math.pow(this.m_base, this.m_exponente);
        //Fin Generación del periodo

        double numeroAleatorio;

        //Primer Ciclo (2*)
        if (ciclos == 0) {
            aleatorioDinamico = ((this.a * this.semilla + this.c) % Math.pow(this.m_base, this.m_exponente));
            numeroAleatorio = numeroAleatorio(aleatorioDinamico, periodo);
            //System.out.println("Primer Aleatorio: " + numeroAleatorio);
            ciclos++;
        } //Fin Primer Ciclo
        else {
            double xn;
            xn = ((this.a * aleatorioDinamico + this.c) % periodo);
            numeroAleatorio = numeroAleatorio(xn, periodo);
            aleatorioDinamico = xn;
            //System.out.println("Último Aleatorio: " + numeroAleatorio);
        }
        return numeroAleatorio;
    }

    private double numeroAleatorio(double generado, double periodo) {
        return (generado / periodo);
    }
}
