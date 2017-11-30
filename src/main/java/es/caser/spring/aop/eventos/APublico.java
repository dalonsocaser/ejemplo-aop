package es.caser.spring.aop.eventos;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class APublico {
	@Before("execution(** es.caser.spring.aop.eventos.IEvento.evento(..))")
	public void apagarMoviles() {
		System.out.println("Apagando los moviles");	
	}
	@Before("execution(** es.caser.spring.aop.eventos.IEvento.evento(..))")
	public void toamrAsientos() {
	System.out.println("Ocupen sus asientos");
	}
	@AfterReturning("execution(** es.caser.spring.aop.eventos.IEvento.evento(..))")
	public void aplaudir() {
	System.out.println("CLAP CLAP CLAP!!!");
	}
	@AfterThrowing("execution(** es.caser.spring.aop.eventos.IEvento.evento(..))")
	public void solicitarDevolucion() {
	System.out.println("Solicitando devolucion");
	}
}
