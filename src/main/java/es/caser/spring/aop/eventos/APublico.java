package es.caser.spring.aop.eventos;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class APublico {
	@Before("execution(** es.caser.spring.aop.eventos.IEvento.evento(..))")
	public void silenceCellPhones() {
		System.out.println("Silencing cell phones");
	
	}
	@Before("execution(** es.caser.spring.aop.eventos.IEvento.evento(..))")
	public void takeSeats() {
	System.out.println("Taking seats");
	}
	@AfterReturning("execution(** es.caser.spring.aop.eventos.IEvento.evento(..))")
	public void applause() {
	System.out.println("CLAP CLAP CLAP!!!");
	}
	@AfterThrowing("execution(** es.caser.spring.aop.eventos.IEvento.evento(..))")
	public void demandRefund() {
	System.out.println("Demanding a refund");
	}
}
