package es.caser.spring.aop.eventos;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class APublico {
	
	@Pointcut("execution(* es.caser.spring.aop.eventos.IEvento.eventoConOcupacion(long)) " + "&& args(ocupacion)")
	public void evaluarEvento(long ocupacion) {
	}

	@Before("evaluarEvento(ocupacion)")
	public void ejecutarAspecto(long ocupacion) {
		System.out.println("ocupacion:"+ocupacion);
	}
}
