package com.alura.churninsight.Cliente;
import jakarta.validation.constraints.*;

public record ClienteDatos(

        @NotNull(message = "El ID es requerido")
        @Positive(message = "El ID debe ser positivo")
        Integer id,
        @NotBlank(message = "El género es requerido")
        @Pattern(regexp = "^(HOMBRE|MUJER|INDETERMINADO)$",
                message = "Género debe ser 'HOMBRE' o 'MUJER' o 'INDERTEMINADO'")
        GeneroStatus generos,
        @NotNull(message = "El tiempo en meses es requerido")
        @Min(value = 1, message = "El tiempo mínimo es 1 mes")
        @Max(value = 120, message = "El tiempo máximo es 120 meses")
        Integer tiempoMeses,
        @NotNull(message = "Los retrasos de pago son requeridos")
        @Min(value = 0, message = "Los retrasos no pueden ser negativos")
        Integer retrasosPago,
        @NotNull(message = "El uso mensual es requerido")
        @PositiveOrZero(message = "El uso mensual no puede ser negativo")
        Double usoMensualHrs,
        @NotBlank(message = "El plan es requerido")
        @Pattern(regexp = "^(BASICO|ESTANDAR|PREMIUM)$",
                message = "Plan debe ser: BASICO, ESTANDAR o PREMIUM")
        PlanStatus plan,
        @NotNull(message = "Los tickets de soporte son requeridos")
        @Min(value = 0, message = "Los tickets no pueden ser negativos")
        Integer soporteTickets,
        @NotBlank(message = "El cambio de plan es requerido")
        @Pattern(regexp = "^(Si|No)$", message = "Cambio de plan debe ser 'Si' o 'No'")
        String cambioPlan,
        @NotBlank(message = "El pago automático es requerido")
        @Pattern(regexp = "^(Si|No)$", message = "Pago automático debe ser 'Si' o 'No'")
        String pagoAutomatico,
        @NotNull(message = "La edad es requerida")
        @Min(value = 18, message = "La edad mínima es 18 años")
        @Max(value = 100, message = "La edad máxima es 100 años")
        Integer edad

        ) {
}
