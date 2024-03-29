package ru.job4j.kitchen.domain.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 3. Мидл
 * 3.5. Микросервисы
 * Job4j Hungry Wolf
 * Job4j KITCHEN
 * 5. Повествование основанное на хореографии [#458498]
 * RestTemplateConfiguration клас создания и настройки объекта RestTemplate;
 *
 * @author Dmitry Stepanov, user Dmitry
 * @since 16.05.2023
 */
@Configuration
public class RestTemplateConfiguration {
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
