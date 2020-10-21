package com.example.model_view;

public class SimuladorHipoteca {

    public static class Solicitud {
        public double capital;
        public int plazo;

        public Solicitud(double capital, int plazo) {
            this.capital = capital;
            this.plazo = plazo;
        }
    }

    public double calcular(Solicitud solicitud) {
        double interes = 0;
        try {
            Thread.sleep(10000);   // simular operacion de larga duracion (10s)
            interes = 0.01605;
        } catch (InterruptedException e) {}

        return solicitud.capital*interes/12/(1-Math.pow(1+(interes/12),-solicitud.plazo*12));
    }
}