package com.example.cleanarch.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "patrones",
                version = "1.0.0",
                description = "Ejemplos de patrones de diseño."
        )
)
public class SwaggerConfig {
}
