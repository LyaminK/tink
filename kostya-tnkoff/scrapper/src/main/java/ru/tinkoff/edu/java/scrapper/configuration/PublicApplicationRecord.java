package ru.tinkoff.edu.java.scrapper.configuration;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.boot.context.properties.ConfigurationProperties;
@Validated
@ConfigurationProperties(prefix = "app", ignoreUnknownFields = false)

public record PublicApplicationRecord(@NotNull String test) {

}
