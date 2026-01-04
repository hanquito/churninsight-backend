package com.alura.churninsight.domian.Prediccion;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
public class GenerarPassword {
    public static void main(String[] args) {
        System.out.println(
                new BCryptPasswordEncoder().encode("admin123")
        );
    }
}

