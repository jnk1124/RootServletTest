package org.example.sfav6.common;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Getter @Setter
@PropertySource("classpath:sfa.properties")
public class SfaProperty {

    @Value("${sfa.name}")
    private String name;
}
