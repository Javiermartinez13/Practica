package mates;

import java.util.Random;

public class Matematicas {

    public static double generarNumeroPiIterativo(long pasos) {
        long puntosEnCirculo = 0;

        Random random = new Random();

        for (long i = 0; i < pasos; i++) {
            double x = random.nextDouble();  
            double y = random.nextDouble();  

            // Calcular la distancia desde el punto al centro (0.5, 0.5)
            double distanciaAlCentro = Math.sqrt(Math.pow(x - 0.5, 2) + Math.pow(y - 0.5, 2));

            // Verificar si el punto está dentro del círculo (radio = 0.5)
            if (distanciaAlCentro <= 0.5) {
                puntosEnCirculo++;
            }
        }

        // Calcular la aproximación de pi utilizando la relación puntosEnCirculo / totalPuntos
        double aproximacionPi = 4.0 * puntosEnCirculo / pasos;

        return aproximacionPi;
    }

    public static void main(String[] args) {
        long pasos = 100000;  // Puedes ajustar este valor según sea necesario
        double aproximacionPi = generarNumeroPiIterativo(pasos);
        System.out.println("Aproximación de pi después de " + pasos + " pasos: " + aproximacionPi);
    }
}
