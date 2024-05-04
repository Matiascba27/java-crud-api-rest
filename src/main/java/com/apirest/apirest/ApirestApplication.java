// Definimos el paquete de la aplicación
package com.apirest.apirest;

// Importamos las clases necesarias de Spring Boot
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Anotación que indica que esta es una aplicación Spring Boot
@SpringBootApplication
public class ApirestApplication {

    // Método principal de la aplicación
    public static void main(String[] args) {
        // Ejecuta la aplicación Spring Boot
        SpringApplication.run(ApirestApplication.class, args);

        // Comentario: Este es el punto de entrada de la aplicación. Cuando se ejecuta este método, Spring Boot se encarga de inicializar y configurar toda la aplicación.
    }

}