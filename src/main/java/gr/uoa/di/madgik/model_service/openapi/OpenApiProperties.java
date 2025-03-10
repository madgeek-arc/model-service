package gr.uoa.di.madgik.model_service.openapi;

import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "springdoc.open-api")
public class OpenApiProperties extends OpenAPI {
}
