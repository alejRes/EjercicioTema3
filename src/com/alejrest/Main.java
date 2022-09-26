package com.alejrest;

public class Main {
    public static void main(String[] args) {
        String[] nombres = {"Pepe, Paco, Maria, Luis"};
        String nombreConcatenados = concatenaNombres(nombres);
        System.out.println(nombreConcatenados);
    }

    private static String concatenaNombres(String[] nombres) {
        String nombresUnidos = "";
        for (int i = 0; i < nombres.length; i++){
            nombresUnidos += nombres[i];
            if (i != nombres.length -1){
                nombresUnidos.concat(", ");
            }
        }
        return nombresUnidos;
    }
}