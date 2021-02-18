package com.hhq.order;

import com.hhq.common_sdk.swagger2.SwaggerDefaultConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerAppConfig extends SwaggerDefaultConfig {

    @Bean
    public Docket docket(){
        Docket restApi = createRestApi();
        return restApi;
    }
}
