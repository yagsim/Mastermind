package com.company;

public class MasterMind {


    public static void main(String[] args) {

        Tablero tab = Tablero.getInstance();

        assert tab != null;
        Funcionamiento.generarAleatorio(tab);


        for (int intentos=0; intentos<10; intentos++) {
            Funcionamiento.pedirSec(tab);
            if (Funcionamiento.comprobarSec(tab.getCifraAleatoria(), tab.getCifraSecuencia())){
                Funcionamiento.mostrar("GANASTE!!!");
                break;
            } else {
                Funcionamiento.mostrarPista(tab.getCifraPista());

            }
        }


        Funcionamiento.mostrar("FIN");
        Funcionamiento.mostrarPista(tab.getCifraPista());
    }


}