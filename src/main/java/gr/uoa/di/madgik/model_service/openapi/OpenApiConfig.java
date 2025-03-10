package gr.uoa.di.madgik.model_service.openapi;

import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(OpenApiProperties.class)
public class OpenApiConfig {

    @Bean
    public OpenAPI openAPI(OpenApiProperties properties) {
        return properties;
    }
}
