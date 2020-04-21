package com.jmm.ind_sale_storage.core.config;
import com.jmm.ind_sale_storage.core.interceptor.SystemInterceptor;
import com.jmm.ind_sale_storage.core.security.AuthInterceptor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * @Autor guoyh
 * @Date 20120-02-08 0011
 * @Usage
 */
@Configuration
//@ConfigurationProperties(prefix = "system")
@Getter
@Setter
public class WebConfig implements WebMvcConfigurer {

//    private List authless_uri;
//    private List<String> allowed_region;
//    @Autowired
//    private AuthInterceptor authInterceptor;
//    @Autowired
//    private SystemInterceptor systemInterceptor;
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(authInterceptor).addPathPatterns("/**").excludePathPatterns(authless_uri);
//        registry.addInterceptor(systemInterceptor).addPathPatterns("/**");
//    }
//
//    @Bean
//    public CorsFilter corsFilter() {
//        CorsConfiguration corsConfiguration = new CorsConfiguration();
//        allowed_region.forEach(item->{
//            corsConfiguration.addAllowedOrigin(item);
//        });
//        corsConfiguration.addAllowedHeader("*");
//        corsConfiguration.addAllowedMethod("*");
//        corsConfiguration.setAllowCredentials(true);
//        UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
//        urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
//        return new CorsFilter(urlBasedCorsConfigurationSource);
//    }

}
