package com.alura.churninsight.domian.Usuario;

import jakarta.validation.constraints.NotBlank;

public record DatosAutenticacion(
        @NotBlank String correoElectronico,
        @NotBlank String contrasena
) {
}
