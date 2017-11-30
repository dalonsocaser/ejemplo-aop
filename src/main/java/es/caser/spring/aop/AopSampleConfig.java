package es.caser.spring.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import es.caser.spring.aop.eventos.APublico;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class AopSampleConfig {
	@Bean
	public APublico audience() {
		return new APublico();
	}
}
