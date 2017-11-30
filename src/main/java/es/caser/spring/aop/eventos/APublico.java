package es.caser.spring.aop.eventos;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class APublico {
	@Pointcut("execution(** es.caser.spring.aop.eventos.IEvento.evento(..))")
	public void evaluarEvento() {
	}

	@Around("evaluarEvento()")
	public void watchPerformance(ProceedingJoinPoint jp) {
		try {
			System.out.println("Apagar moviles");
			System.out.println("Tomando asientos");
			jp.proceed();
			System.out.println("CLAP CLAP CLAP!!!");
		} catch (Throwable e) {
			System.out.println("Solicitando devolucion");
		}
	}
}
