package com.demoj3v2.demoj3v2;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({
    @PropertySource(value="classpath:values.properties", encoding="UTF-8")
})

public class ValuesConfig {

}
