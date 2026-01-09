package com.alura.churninsight.domian.Prediccion;

public record ResultadoPrediccion(
        boolean churn,
        double probabilidad
) {
}
