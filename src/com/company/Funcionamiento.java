package com.company;

import java.util.Scanner;

public class Funcionamiento {

    /**
     * @param tablero
     * @return
     */

    public static Boolean generarAleatorio(Tablero table) {
        table.setCifraAleatoria("54432");
        return true;
    }

    public static void pedirSec(Tablero tablero) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca cifra Secuencia:");
        tablero.setCifraSec(sc.next());
    }

    public static void mostrar(String mensaje) {
    }

    /**
     *
     * @param cifraAleatoria cifra generada
     * @param cifraSecuencia cifra introducida por el jugador
     * @return
     */

    public static boolean comprobarSec(String aleatoria, String secuencia) {
        boolean resultado = false;
        Tablero tab = Tablero.getInstance();
        String cadena = "";

        if (aleatoria.equals(secuencia)) {
            resultado = true;
        } else {
            for (int i = 0; i < aleatoria.length(); i++) {
                if (aleatoria.charAt(i)==secuencia.charAt(i)) {
                    cadena = cadena+"o";
                } else if (aleatoria.contains(String.valueOf(secuencia.charAt(i)))) {
                    cadena = cadena+"-";
                } else {
                    cadena = cadena+"x";
                }
            }

            tab.setCifraPista(cadena);
        }
        return resultado;
    }
    public static void mostrarPista(String cifraPista) {
        System.out.println(cifraPista);
    }
}