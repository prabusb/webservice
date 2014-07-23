
package com.tcs.service.webconfig;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

/**
 * <p>
 * Spring MVC Configuration. Turns on @Component scanning, loads externalized application.properties, and sets up the database.
 * </p>
 * 
 * @author Prabu S B
 * @since 1.0
 * @version 1.0
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.tcs.service")
public class WebMvcConfig extends WebMvcConfigurerAdapter {
    
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("/static/");
    }


    @Bean
    public ViewResolver viewResolver() {
/*        UrlBasedViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(InternalResourceViewResolver.class);
        viewResolver.setPrefix("/view/");
        viewResolver.setSuffix(".jsp");*/
        
        UrlBasedViewResolver viewResolver = new UrlBasedViewResolver();
        viewResolver.setPrefix("/view/");
        viewResolver.setSuffix(".jsp");
        viewResolver.setViewClass(JstlView.class);
        return viewResolver;
    }


}

