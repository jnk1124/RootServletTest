package org.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@ComponentScan(excludeFilters = {@ComponentScan.Filter(RestController.class),
                                    @ComponentScan.Filter(Service.class),
                                    @ComponentScan.Filter(Configuration.class)
                },
                basePackages = "org.example.common"
)
public class MobileB2EConfig {
}
