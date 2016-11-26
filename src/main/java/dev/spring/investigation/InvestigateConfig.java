package dev.spring.investigation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * Java configuration class for project investigation
 * @author Lennon
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan
public class InvestigateConfig extends WebMvcConfigurerAdapter{
	/**
	 * @Configuration means that the class declares one or more @Bean methods
	 * @EnableWebMvc is equivalent to mvc:annotation-driven, and enables 
	 * @Controller annotated classes that use @RequestMapping
	 * @Component scan is equivalent to <context:component-scan>
	 * @return
	 */
	
	@Bean
	public ViewResolver viewResolver(){
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		
		return viewResolver;
	}
	
	/**
	 * Enables the default servlet handler. Enables other http requests
	 * to come through the usual dispatcher servlet and allows the container
	 * to process them. Static files can be served from the webapp folder
	 */
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer){
		configurer.enable();
	}

}
