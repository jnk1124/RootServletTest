package org.example.ebdr.common;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Getter @Setter
@PropertySource("classpath:ebdr.properties")
public class EbdrProperty {

    @Value("${ebdr.name}")
    private String name;
}
